-- -------------------------README---------------------------------------------------
-- 图仓 oracle 存储过程初始脚本
-- 该脚本需要运行在全量或者迭代脚本之前
-- 该脚本可重复执行


-- =====
-- 初始化非业务辅助表
-- 可重复执行
-- =====

-- 全局参数定义存储过程，为了统一后续使用
-- DROP PROCEDURE proc_global_param;
CREATE OR REPLACE PROCEDURE proc_global_param(
    regist_table_name out VARCHAR,
    op_table_name out VARCHAR,
    version_table_name out VARCHAR
)AUTHID CURRENT_USER
AS
BEGIN
    -- 脚本辅助表，登记表
    regist_table_name := 'SYS_TABLES2';
    -- 脚本辅助表，操作表
    op_table_name := 'SYS_UPDATE_HISTORY2';
    -- 脚本辅助表，版本表
    version_table_name := 'SYS_VERSION2';
END;
/


-- DROP PROCEDURE proc_execute;
CREATE OR REPLACE PROCEDURE proc_execute
(content VARCHAR)
AUTHID CURRENT_USER
AS
BEGIN
    -- TODO 如果执行的内容超出oracle限定的单次执行sql长度，则转换为存储过程来执行
    EXECUTE IMMEDIATE content;
END;
/

-- 注释表存储过程
-- DROP PROCEDURE proc_comment_table;
CREATE OR REPLACE PROCEDURE proc_comment_table
(p_table_name VARCHAR,content VARCHAR)
AUTHID CURRENT_USER
AS
BEGIN
    -- 需要外部保证表的存在
    EXECUTE IMMEDIATE 'COMMENT ON TABLE "' || p_table_name || '" IS ''' || content || '''';
END;
/

-- 注释字段存储过程
-- DROP PROCEDURE proc_comment_column;
CREATE OR REPLACE PROCEDURE proc_comment_column
(p_table_name VARCHAR,p_column_name VARCHAR,content VARCHAR)
AUTHID CURRENT_USER
AS
BEGIN
    -- 需要外部保证表和字段的存在
    EXECUTE IMMEDIATE 'COMMENT ON COLUMN "' || p_table_name || '"."' || p_column_name  || '" IS ''' || content || '''';
END;
/

-- 初始化辅助表存储过程
--DROP PROCEDURE proc_init_assist;
CREATE OR REPLACE PROCEDURE proc_init_assist(v date)
AUTHID CURRENT_USER
AS
  regist_table_name VARCHAR(1000);
  op_table_name VARCHAR(1000);
  version_table_name VARCHAR(1000);
  regist_create_sql VARCHAR(1000);
  op_create_sql VARCHAR(1000);
  version_create_sql VARCHAR(1000);
  table_count number;
  BEGIN
    proc_global_param(regist_table_name,op_table_name,version_table_name);
    SELECT count(*) INTO table_count FROM user_tables WHERE table_name = regist_table_name;
    IF table_count <= 0 then
        -- dbms_output.put_line('创建非业务辅助表-登记表:' || regist_table_name);
        regist_create_sql := 'CREATE TABLE "' || regist_table_name || '" (
          "TABLE_NAME" NVARCHAR2(50) NOT NULL ,
          "CREATED_DT" DATE NOT NULL
        )';
        proc_execute(regist_create_sql);
        proc_comment_table(regist_table_name,'图平台业务表的记录表');
        proc_comment_column(regist_table_name,'TABLE_NAME','图平台表名');
    END IF;

    SELECT count(*) INTO table_count FROM user_tables WHERE table_name = op_table_name;
    IF table_count <= 0 then
        -- dbms_output.put_line('创建非业务辅助表-操作表:' || op_table_name);
        op_create_sql := 'CREATE TABLE "'|| op_table_name ||'" (
          "ID" NUMBER(11) NOT NULL ,
          "UPDATE_RANGE" NVARCHAR2(50) NOT NULL ,
          "OPERATE_TYPE" NVARCHAR2(50) NOT NULL ,
          "OPERATE_STATUS" NVARCHAR2(50) NOT NULL ,
          "DETAIL" NCLOB NOT NULL ,
          "REMARK" NVARCHAR2(200) ,
          "CREATED_BY" NVARCHAR2(50) ,
          "CREATED_DT" DATE
        )';
        proc_execute(op_create_sql);
        proc_comment_table(op_table_name,'操作记录表');
        proc_comment_column(op_table_name,'UPDATE_RANGE','更新范围 [SQL、LICENSE]');
        proc_comment_column(op_table_name,'OPERATE_TYPE','操作类型 [UPDATE、INIT]');
        proc_comment_column(op_table_name,'OPERATE_STATUS','操作状态 [START、FAILED, SUCCEEDED]');
        proc_comment_column(op_table_name,'DETAIL','更新细节');
        proc_comment_column(op_table_name,'REMARK','更新备注');
    END IF;

    SELECT count(*) INTO table_count FROM user_tables WHERE table_name = version_table_name;
    IF table_count <= 0 then
         version_create_sql := 'CREATE TABLE "' || version_table_name || '" (
          "VERSION" NVARCHAR2(50)
        )';
        -- dbms_output.put_line('创建非业务辅助表-版本表:' || version_table_name);
        proc_execute(version_create_sql);
        proc_execute('INSERT INTO "' || version_table_name || '"("VERSION") VALUES(''0.0.0'')');
        proc_comment_table(version_table_name,'版本记录表');
        proc_comment_column(version_table_name,'VERSION','版本号');
    END IF;

  END;
/

-- 检查数据库脚本版本
-- DROP PROCEDURE proc_check_version;
CREATE OR REPLACE PROCEDURE proc_check_version(
    new_db_version VARCHAR,allow_db_versions VARCHAR,old_db_version OUT VARCHAR,validate_code OUT INT
)AUTHID CURRENT_USER
AS
    regist_table_name VARCHAR(1000);
    op_table_name VARCHAR(1000);
    version_table_name VARCHAR(1000);
    sql_content VARCHAR(1000);
	compare_index INT;
BEGIN

    proc_global_param(regist_table_name,op_table_name,version_table_name);
    proc_init_assist(SYSDATE);

    sql_content := 'SELECT "VERSION" FROM "' || version_table_name || '"';

    EXECUTE IMMEDIATE sql_content INTO old_db_version;
    -- dbms_output.put_line('当前版本为：' || old_db_version);

    compare_index := INSTR(allow_db_versions, old_db_version);
    IF compare_index > 0 THEN
        -- 在原版本上升级
        EXECUTE IMMEDIATE 'UPDATE ' || version_table_name || ' SET VERSION=''' || new_db_version || '''';
        validate_code := 0;
    ELSE
        -- 新版本和老版本一样，则视为在同一版本升级
        compare_index := INSTR(new_db_version, old_db_version);
        IF compare_index = 0 THEN
            --老版本不在运行升级的版本中
            validate_code := -1;
        END IF;
    END IF;
END;
/

-- 检查表字段数量
-- DROP PROCEDURE proc_table_column_count;
CREATE OR REPLACE PROCEDURE proc_table_column_count
(p_table_name VARCHAR ,p_column_name VARCHAR, column_count OUT INT)
AUTHID CURRENT_USER
AS
  BEGIN
    SELECT count(*) INTO column_count FROM user_tab_columns
        WHERE table_name = p_table_name and column_name = p_column_name;
  END;
/

-- 查询表的主键是否存在，不存在则以指定的字段创建
-- DROP PROCEDURE proc_table_pk;
CREATE OR REPLACE PROCEDURE proc_table_pk
(p_table_name VARCHAR, pk_column_name VARCHAR, pk_name VARCHAR)
AUTHID CURRENT_USER
AS
  column_count INT;
  BEGIN
    SELECT count(*) INTO column_count FROM user_constraints
        WHERE table_name = p_table_name and constraint_type ='P';
    IF column_count = 0 THEN
        -- 判断主键字段是否存在，如果存在则创建
        proc_table_column_count(p_table_name,pk_column_name,column_count);
        IF column_count = 1 THEN
            proc_execute('ALTER TABLE ' || p_table_name || ' ADD (CONSTRAINT '|| pk_name || ' PRIMARY KEY (' || pk_column_name || '))');
        END IF;
    END IF;
  END;
/

-- 查询表的主键序列化器是否存在，不存在则以指定的字段创建
-- DROP PROCEDURE proc_table_pk_seq;
CREATE OR REPLACE PROCEDURE proc_table_pk_seq
(p_table_name VARCHAR, pk_sequence_name VARCHAR)
AUTHID CURRENT_USER
AS
  column_count INT;
  BEGIN
    SELECT count(*) INTO column_count FROM user_sequences
        WHERE sequence_name = pk_sequence_name;
    IF column_count = 0 THEN
        -- 判断序列化器是否存在，如果不存在则创建
        execute immediate 'CREATE SEQUENCE ' || pk_sequence_name || ' START WITH 1';
    END IF;
  END;
/

-- 查询表的触发器是否存在，不存在则创建
-- DROP PROCEDURE proc_table_trigger;
CREATE OR REPLACE PROCEDURE proc_table_trigger(
    p_table_name VARCHAR,
    p_trigger_name VARCHAR,
    op_type VARCHAR,
    condition VARCHAR,
    content VARCHAR
)AUTHID CURRENT_USER
AS
  column_count INT;
  sql_content VARCHAR(1000);
  BEGIN
    SELECT count(*) INTO column_count FROM user_triggers
        WHERE trigger_name = p_trigger_name and table_name = p_table_name;
    IF column_count <= 0 THEN
        -- 判断触发器是否存在，如果不存在则创建
        sql_content := 'CREATE OR REPLACE TRIGGER ' || p_trigger_name
                        || ' ' || op_type || ' ON ' || p_table_name
                        || ' REFERENCING NEW AS NEW OLD AS OLD FOR EACH ROW '
                        || condition
                        || ' BEGIN '
                        || content
                        || ' END;';
        -- dbms_output.put_line('trigger: ' || sql_content);
        execute immediate sql_content;
    END IF;
  END;
/


-- 注销登记表存储过程
-- DROP PROCEDURE proc_unregist_table;
CREATE OR REPLACE PROCEDURE proc_unregist_table(p_table_name IN VARCHAR)
AUTHID CURRENT_USER
AS
    regist_table_name VARCHAR(1000);
    op_table_name VARCHAR(1000);
    version_table_name VARCHAR(1000);
    strSql VARCHAR(4000);
BEGIN
    proc_global_param(regist_table_name,op_table_name,version_table_name);

    strSql :=
    ' DELETE FROM ' || regist_table_name || ' s WHERE s.TABLE_NAME = ''' || p_table_name || '''';

    proc_execute(strSql);
END;
/

-- 登记表存储过程
-- DROP PROCEDURE proc_regist_table;
CREATE OR REPLACE PROCEDURE proc_regist_table(p_table_name IN VARCHAR)
AUTHID CURRENT_USER
AS
    regist_table_name VARCHAR(1000);
    op_table_name VARCHAR(1000);
    version_table_name VARCHAR(1000);
    strSql VARCHAR(4000);
BEGIN
    proc_global_param(regist_table_name,op_table_name,version_table_name);

    strSql :=
    ' INSERT INTO ' || regist_table_name || '("TABLE_NAME","CREATED_DT")
    SELECT ''' || p_table_name || ''',SYSDATE FROM DUAL
    WHERE NOT EXISTS ( SELECT * FROM ' || regist_table_name || ' s WHERE s.TABLE_NAME = ''' || p_table_name || ''')';

    proc_execute(strSql);
END;
/



-- 检查当前数据库版本是否满足要求，如果不满足要求，会报主键冲突的错误阻止后续语句继续执行，请向开发人员及时汇报
-- drop procedure proc_create_unique_key;
CREATE OR REPLACE PROCEDURE proc_create_unique_key(
    p_table_name in VARCHAR,unique_key_name in VARCHAR,fields in VARCHAR
) AUTHID CURRENT_USER
AS
    keyCount  NUMBER;
    execSql VARCHAR(3000);
    unique_key_name2 VARCHAR(200);
    fieldList VARCHAR(2000);
    p_table_name2 VARCHAR(2000);
BEGIN
    p_table_name2 := trim(both '"' from p_table_name);
    unique_key_name2 := trim(both '"' from unique_key_name);
    fieldList := trim(both '"' from fields);
    SELECT count(1) into keyCount FROM user_indexes WHERE index_name = unique_key_name2;
    IF(keyCount <= 0) THEN
        execSql := 'ALTER TABLE '||p_table_name2||' ADD CONSTRAINT '||unique_key_name2||' UNIQUE ('||fieldList||')';
        execute immediate execSql;
    END IF;
end;
/

-- 删除表存储过程，可重复运行
-- DROP PROCEDURE proc_drop_table;
CREATE OR REPLACE PROCEDURE proc_drop_table
(p_table_name IN VARCHAR)
AUTHID CURRENT_USER
AS
    table_count  NUMBER;
    table_length INT;
    p_table_name2 VARCHAR(1000);
    strSQL       VARCHAR(2000);

BEGIN
    proc_init_assist(SYSDATE);

	p_table_name2 := UPPER(TRIM(BOTH '"' FROM p_table_name));
    SELECT count(*) INTO table_count FROM user_tables WHERE table_name = p_table_name2;

    IF table_count > 0 THEN
      strSQL := 'DROP TABLE "' || p_table_name2 || '"';
      proc_execute(strSQL);
    END IF;
    proc_unregist_table(p_table_name2);
END;
/

-- 创建表存储过程，可重复运行
-- DROP PROCEDURE proc_create_table;
CREATE OR REPLACE PROCEDURE proc_create_table
(p_table_name IN VARCHAR, create_sql IN VARCHAR)
AUTHID CURRENT_USER
AS
    table_count  NUMBER;
    strSQL       VARCHAR(2000);
    table_length INT;
    column_count INT;
    p_column_name VARCHAR(1000);
    p_table_name2 VARCHAR(1000);
    pk_column_name VARCHAR(1000);
    pk_name VARCHAR(1000);
    pk_sequence_name VARCHAR(1000);
    p_trigger_name VARCHAR(1000);
    trigger_condition VARCHAR(1000);
    trigger_content VARCHAR(1000);
BEGIN
    proc_init_assist(SYSDATE);

	p_table_name2 := UPPER(TRIM(BOTH '"' FROM p_table_name));
    table_length := LENGTH(p_table_name2);
    IF table_length > 23 THEN
        -- -- dbms_output.put_line('表:' || p_table_name2 ||'长度为:'|| table_length ||' 根据开发规范，表长度不能大于23');
        raise_application_error(-20000, '表:' || p_table_name2 || '长度为:' || table_length || ' 根据开发规范，表长度不能大于23');
    END IF;

    SELECT count(*) INTO table_count FROM user_tables WHERE table_name = p_table_name2;

    IF table_count <= 0 THEN
        strSQL := create_sql;
        proc_execute(strSQL);

        -- #创建自增序列，主键，时间类型默认值触发器
        pk_column_name := 'ID';
        pk_name := UPPER(p_table_name2) || '_PK';
        pk_sequence_name := UPPER(p_table_name2) || '_SEQ';
        p_trigger_name := 'TRG_' || UPPER(p_table_name2) || '_ID';
        -- 主键约束检查或者创建
        proc_table_pk(p_table_name2, pk_column_name, pk_name);
        -- 主键序列化器检查或者创建
        proc_table_pk_seq(p_table_name2, pk_sequence_name);
        -- 主键触发器检查或者创建
        trigger_condition := 'when (new.' || pk_column_name || ' is null)';
        trigger_content := 'SELECT ' || pk_sequence_name || '.NEXTVAL INTO :new.' || pk_column_name || ' FROM dual;';
        proc_table_trigger(p_table_name2,p_trigger_name,'BEFORE INSERT',trigger_condition,trigger_content);

        proc_regist_table(p_table_name2);
    END IF;
    --假删标识
    column_count := 0;
    p_column_name := 'ENABLED_FLAG';
    proc_table_column_count(p_table_name2,p_column_name,column_count);
    IF column_count > 0 THEN
        EXECUTE IMMEDIATE ' ALTER TABLE '|| p_table_name2 || ' MODIFY ("ENABLED_FLAG" DEFAULT ''Y'')';
        EXECUTE IMMEDIATE ' COMMENT ON COLUMN "' || p_table_name2 || '".ENABLED_FLAG IS ''可用状态:Y-是;N-否''';
    END IF;


    -- 创建时间
    column_count := 0;
    p_column_name := 'CREATED_DT';
    proc_table_column_count(p_table_name2,p_column_name,column_count);
    IF column_count > 0 THEN
		p_trigger_name := 'TRG_' || UPPER(p_table_name2) || '_CT';
        trigger_condition := '';
        trigger_content := ' IF INSERTING THEN :NEW.' || p_column_name || ' := SYSDATE; ELSE NULL; END IF; ';
        proc_table_trigger(p_table_name2,p_trigger_name,' BEFORE INSERT ',trigger_condition,trigger_content);
    END IF;

    -- 更新时间
    column_count := 0;
    p_column_name := 'UPDATED_DT';
    proc_table_column_count(p_table_name2,p_column_name,column_count);
    IF column_count > 0 THEN
		p_trigger_name := 'TRG_' || UPPER(p_table_name2) || '_UT';
        trigger_condition := '';
        trigger_content := 'IF UPDATING THEN :NEW.' || p_column_name || ' := SYSDATE; ELSE NULL; END IF; ';
        proc_table_trigger(p_table_name2,p_trigger_name,' BEFORE UPDATE ',trigger_condition,trigger_content);
    END IF;


END;
/


-- 表字段变更存储过程
-- =================================================================================================*/
-- proc_column_update                                                                          */
--  addColumn：  proc_column_update ('addColumn','PM_STYLE_RULE','REMARK', 'varchar2(200) NULL');   */
--  modColumnProperty： proc_column_update ("modColumnProperty','tbl_elevator_credential_info','Name1','VARCHAR(20)');      */
--  modColumnName：  proc_column_update ('modColumnName','tbl_elevator_credential_info','Name1','Name2');*/
--  modColumnComment： proc_column_update ('modColumnComment','tbl_elevator_credential_info','Name1','');                 */
--  delColumn：     proc_column_update ('delColumn','tbl_elevator_credential_info','Name1','说明信息');                 */
-- =================================================================================================*/
-- DROP PROCEDURE proc_column_update;
CREATE OR REPLACE PROCEDURE proc_column_update(
    columnOperType IN VARCHAR, p_table_name IN VARCHAR,
    p_column_name IN VARCHAR, extend_sql IN VARCHAR
) AUTHID CURRENT_USER
AS
    strSql          VARCHAR(1000);
    extend_sql_2    VARCHAR(2000);
    p_column_name2  VARCHAR(2000);
    p_table_name2   VARCHAR(2000);
    rowCount        NUMBER;
    hasNull         INT;
    hasNot          INT;
    hasDefault      INT;
    null_able       VARCHAR(10);
    actionWordCount INT;
BEGIN
    strSql := '';
    rowCount := 0;
    p_table_name2 := upper(trim(BOTH '"' FROM p_table_name));
    p_column_name2 := upper(trim(BOTH '"' FROM p_column_name));
    extend_sql_2 := extend_sql;
    SELECT count(1) INTO rowCount FROM user_tab_cols
        WHERE table_name = p_table_name2 AND column_name = p_column_name2;

    -- addColumn
    IF (columnOperType = 'addColumn' AND rowCount <= 0)
    THEN
      strSql := 'alter table ' || p_table_name2 || ' add ' || p_column_name2 || ' ' || extend_sql_2;
      -- modColumnProperty
    ELSIF (columnOperType = 'modColumnProperty' AND rowCount > 0) THEN
        SELECT nullable INTO null_able FROM user_tab_columns
            WHERE table_name = p_table_name2 AND column_name = p_column_name2;
        hasNull := instr(UPPER(extend_sql_2), 'NULL');
        hasNot := INSTR(UPPER(extend_sql_2), 'NOT');
        hasDefault := INSTR(UPPER(extend_sql_2), 'DEFAULT');
        SELECT REGEXP_COUNT(TRIM(extend_sql), ' ') + 1 INTO actionWordCount FROM DUAL;
        IF ((hasNull > 0 AND hasNot <= 0 AND hasDefault <= 0 AND actionWordCount >= 2)
            OR (hasNull > 0 AND (hasNot > 0 OR hasDefault > 0) AND actionWordCount >= 3))
        THEN
          raise_application_error(-20001, 'Oracle 不支持在同一个alter table 语句中修改多个列属性，:' || extend_sql ||
                                          ',请调整! 参考:https://www.cnblogs.com/youseiraws/p/8622338.html');
        END IF;
        IF (null_able = 'N' AND hasNull > 0 AND hasNot <= 0)
           OR (null_able = 'Y' AND hasNull > 0 AND hasNot > 0)
           OR (hasNull <= 0)
        THEN
          -- only allow set not null to null
          strSql := 'alter table ' || p_table_name2 || ' modify (' || p_column_name2 || ' ' || extend_sql_2 || ')';
        END IF;
        -- modColumnName
    ELSIF (columnOperType = 'modColumnName' AND rowCount > 0)
      THEN
        strSql := 'alter table ' || p_table_name2 || ' rename column ' || p_column_name2 || ' to ' || extend_sql_2;
    ELSIF (columnOperType = 'modColumnComment' AND rowCount > 0)
      THEN
        strSql := ' COMMENT ON COLUMN ' || p_table_name2 || '.' || p_column_name2 || ' IS ''' || extend_sql || '''';
        -- delColumn
    ELSIF (columnOperType = 'delColumn' AND rowCount > 0)
      THEN
        strSql := 'alter table ' || p_table_name2 || ' drop column ' || p_column_name2;
    ELSE
      strSql := '';
    END IF;
    -- -- dbms_output.put_line('sql:====>'||strSql);
    IF (strSql IS NOT NULL)
    THEN
      EXECUTE IMMEDIATE strSql;
    END IF;
END;
/

