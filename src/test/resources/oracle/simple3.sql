---------------------------重要说明---------------------------------------------------
-- ------------------------------准备工作 准备业务表的记录表---------------------------------------------------
-- ==================
-- 升级脚本固定开始部分(进行版本检测和更新记录);
-- ==================
-- 一、执行前提：执行本更新数据脚本之前，数据结构已处于 0.0.0 版本，可在版本表中查看版本,查询语句如下：
-- select * from sys_version;
-- 二、升级过程
-- 检查当前数据库版本是否满足要求，如果不满足要求，会报主键冲突的错误阻止后续语句继续执行，请向开发人员及时汇报
declare
	new_db_version varchar(1000) := '1.0.0';
allow_db_version varchar(1000) := '0.0.0';
old_db_version varchar(1000);
validate_code int;
BEGIN
dbms_output.enable();
proc_check_version(new_db_version,allow_db_version,old_db_version,validate_code);
dbms_output.put_line('校验code:' || validate_code || '当前待升级的数据库版本是:' || old_db_version || ',升级到:' || new_db_version);
IF validate_code <> 0 THEN
		raise_application_error(-20000,'当前待升级的数据库版本是:' || old_db_version || ',无法直接升级到:' || new_db_version || ',请使用正确的升级脚本');
END IF;
END;
/


-- TODO 记录脚本更新记录，暂无重要用途

-- ==================
-- 删除表，新建表
-- ==================

BEGIN
  proc_create_table(
      'DATABASE_KEYWORD',
      'CREATE TABLE "DATABASE_KEYWORD" (
            "ID" NUMBER(11) NOT NULL ,
            "KEY_WORD" NVARCHAR2(50) DEFAULT NULL ,
            "DATA_BASE_TYPE" NVARCHAR2(128) DEFAULT NULL
        )'
  );

proc_column_update ('modColumnComment','DATABASE_KEYWORD','KEY_WORD','关键字');
proc_column_update ('modColumnComment','DATABASE_KEYWORD','DATA_BASE_TYPE','数据库类型 Mysql,Oracle');
END;
/


-- ==================
-- 修改表结构更新位置
-- ==================
BEGIN
  proc_create_table('SYS_UPDATE_HISTORY',
'CREATE TABLE "SYS_UPDATE_HISTORY" (
  "ID" NUMBER(11) NOT NULL ,
  "UPDATE_RANGE" NVARCHAR2(50) NOT NULL ,
  "OPERATE_TYPE" NVARCHAR2(50) NOT NULL ,
  "OPERATE_STATUS" NVARCHAR2(50) NOT NULL ,
  "DETAIL" NCLOB NOT NULL ,
  "REMARK" NVARCHAR2(200) ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_UPDATE_HISTORY','UPDATE_RANGE','更新范围 [SQL、LICENSE]');
proc_column_update ('modColumnComment','SYS_UPDATE_HISTORY','OPERATE_TYPE','操作类型 [UPDATE、INIT]');
proc_column_update ('modColumnComment','SYS_UPDATE_HISTORY','OPERATE_STATUS','操作状态 [START、FAILED, SUCCEEDED]');
proc_column_update ('modColumnComment','SYS_UPDATE_HISTORY','DETAIL','更新细节');
proc_column_update ('modColumnComment','SYS_UPDATE_HISTORY','REMARK','更新备注');
proc_comment_table('SYS_UPDATE_HISTORY','更新历史表');
END;
/

BEGIN
  proc_create_table('SYS_CONFIG',
'CREATE TABLE "SYS_CONFIG" (
  "ID" NUMBER(11) NOT NULL ,
  "TYPE" NVARCHAR2(128) NOT NULL ,
  "SUB_TYPE" NVARCHAR2(128) NOT NULL ,
  "CONFIG_KEY" NVARCHAR2(128) NOT NULL ,
  "CONFIG_VALUE" NCLOB ,
  "REMARK" NVARCHAR2(500) ,
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE
)');

proc_create_unique_key ('SYS_CONFIG','UK_SYS_CONFIG','TYPE,SUB_TYPE,CONFIG_KEY');

proc_column_update ('modColumnComment','SYS_CONFIG','TYPE','分类，按子产品区分，取值[DMP-数据平台，GAP-分析平台]');
proc_column_update ('modColumnComment','SYS_CONFIG','SUB_TYPE','子分类，按用途区分，如：URL');
proc_column_update ('modColumnComment','SYS_CONFIG','CONFIG_KEY','键，如：gap.external.manager.url.graph-search-arango');
proc_column_update ('modColumnComment','SYS_CONFIG','CONFIG_VALUE','值');
proc_column_update ('modColumnComment','SYS_CONFIG','REMARK','备注');
proc_column_update ('modColumnComment','SYS_CONFIG','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_comment_table('SYS_CONFIG','系统配置');
END;
/

BEGIN
  proc_create_table('SYS_DICT',
  'CREATE TABLE "SYS_DICT" (
  "ID" NUMBER(11) NOT NULL ,
  "DICT_KEY" NVARCHAR2(50) NOT NULL ,
  "DICT_VALUE" NVARCHAR2(200) NOT NULL ,
  "PARENT_CODE" NVARCHAR2(30) NOT NULL ,
  "DICT_CODE" NVARCHAR2(30) NOT NULL,
  "USAGE_TYPE" NVARCHAR2(30) ,
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_DICT','DICT_KEY','字典健，只能使用大写英文加下划线');
proc_column_update ('modColumnComment','SYS_DICT','DICT_VALUE','字典值');
proc_column_update ('modColumnComment','SYS_DICT','PARENT_CODE','父ID，根节点默认为PARENT');
proc_column_update ('modColumnComment','SYS_DICT','DICT_CODE','字典code,由parent.dict_value 和 自身dict_value组成');
proc_column_update ('modColumnComment','SYS_DICT','USAGE_TYPE','数据源用途[IN-平台数据源，OUT-外部数据源，ALL-全部]');
proc_column_update ('modColumnComment','SYS_DICT','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_comment_table('SYS_DICT','数据字典');
END;
/

BEGIN
  proc_create_table('SYS_RESOURCE',
  'CREATE TABLE "SYS_RESOURCE" (
  "ID" NUMBER(11) NOT NULL ,
  "NAME" NVARCHAR2(50) NOT NULL ,
  "TYPE" NVARCHAR2(30) NOT NULL ,
  "SUB_TYPE" NVARCHAR2(30) ,
  "PARENT_RESOURCE_CODE" NVARCHAR2(256) NOT NULL ,
  "ROOT_MENU" NVARCHAR2(25) DEFAULT NULL,
  "GROUP_TYPE" NVARCHAR2(30) ,
  "CODE" NVARCHAR2(50) ,
  "RESOURCE_CODE" NVARCHAR2(200) ,
  "URL" NVARCHAR2(200) ,
  "ROLES_LIMIT" NVARCHAR2(200),
  "REMARK" NVARCHAR2(200) ,
  "RESOURCE_SOURCE" NVARCHAR2(50) NOT NULL,
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE ,
  "NODE_TYPE_ENABLE_LOG" NVARCHAR2(10) ,
  "OPERATION_ITEM_TEMPLATE" NCLOB ,
  "FUNCTION_MODULE" NVARCHAR2(50) ,
  "UI_CATEGORY" NVARCHAR2(50) ,
  "OPERATION_DETAIL_TEMPLATE" NCLOB
)');

proc_column_update ('modColumnComment','SYS_RESOURCE','NAME','资源名称');
proc_column_update ('modColumnComment','SYS_RESOURCE','TYPE','类型，按子产品或模块划分，取值[SYS-系统模块，DMP-数据平台，GAP-分析平台，KIP-挖掘平台]');
proc_column_update ('modColumnComment','SYS_RESOURCE','SUB_TYPE','子类型,主要是分析平台GAP权限使用,因为应用平台 如:DAP，KAP');
proc_column_update ('modColumnComment','SYS_RESOURCE','PARENT_RESOURCE_CODE','父资源唯一编码，注意根资源的父资源需要设置为 parent_resource_code，代码写死逻辑');
proc_column_update ('modColumnComment','SYS_RESOURCE','ROOT_MENU','根菜单, SYSTEM_MANAGE-系统管理, KNOWLEDGE_MANAGE-知识管理，DATA_MANAGE-数据管理, PROJECT_MANAGE-项目管理（项目级权限）, FOREGROUND_APPLICATION-前台应用, SERVICE_PUBLISH-服务发布');
proc_column_update ('modColumnComment','SYS_RESOURCE','GROUP_TYPE','权限分组，主要是分析平台GAP权限使用,取值[系统级权限S、项目级权限P、服务菜单权限SERVICE,场景探索菜单权限EXPLORE');
proc_column_update ('modColumnComment','SYS_RESOURCE','CODE','权限code,前端使用');
proc_column_update ('modColumnComment','SYS_RESOURCE','RESOURCE_CODE','资源唯一编码,license控制使用');
proc_column_update ('modColumnComment','SYS_RESOURCE','URL','资源访问URL地址');
proc_column_update ('modColumnComment','SYS_RESOURCE','ROLES_LIMIT','角色限制，代表仅有限定的角色拥有该权限，逗号分隔，该权限无法被客户分配，取值[CUSTOMIZABLE无限制，SUPER_ADMIN超管，PROJECT_ADMIN项目管理员]');
proc_column_update ('modColumnComment','SYS_RESOURCE','REMARK','备注');
proc_column_update ('modColumnComment','SYS_RESOURCE','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_column_update ('modColumnComment','SYS_RESOURCE','NODE_TYPE_ENABLE_LOG','节点类型与是否开启日志，Y代表开启日志，N代表关闭日志，取值[RESOURCE权限节点，LOG_Y日志节点且开启日志，LOG_N日志节点且关闭日志，ALL_Y拥有所有节点类型且开启日志，ALL_N拥有所有节点类型且关闭日志]');
proc_column_update ('modColumnComment','SYS_RESOURCE','OPERATION_ITEM_TEMPLATE','操作事项模版');
proc_column_update ('modColumnComment','SYS_RESOURCE','FUNCTION_MODULE','功能模块');
proc_column_update ('modColumnComment','SYS_RESOURCE','UI_CATEGORY','界面分类');
proc_column_update ('modColumnComment','SYS_RESOURCE','OPERATION_DETAIL_TEMPLATE','操作详情模版');
proc_column_update ('modColumnComment','SYS_RESOURCE','RESOURCE_SOURCE','资源来源[GRAPH-图平台，EAP-知识抽取平台, KQA-知识问答]');
proc_comment_table('SYS_RESOURCE','资源');
proc_column_update ('modColumnProperty','SYS_RESOURCE','ROLES_LIMIT','DEFAULT ''CUSTOMIZABLE''');
END;
/

BEGIN
  proc_create_table('SYS_USER_OPERATION_LOG',
  'CREATE TABLE "SYS_USER_OPERATION_LOG" (
  "ID" NUMBER(11) NOT NULL ,
  "OPERATION_ITEM" NVARCHAR2(1000),
  "FUNCTION_MODULE" NVARCHAR2(50) ,
  "UI_CATEGORY" NVARCHAR2(50) ,
  "PROJECT_ORG_ID" NUMBER(11) ,
  "ORG_NAME" NVARCHAR2(500) ,
  "CREATOR_NAME" NVARCHAR2(50) ,
  "CREATOR_NAME_CN" NVARCHAR2(50) ,
  "SYS_ROLE" NVARCHAR2(300) ,
  "OPERATION_IP" NVARCHAR2(100) ,
  "CREATED_DT" DATE ,
  "PROJECT_ID" NUMBER(11) ,
  "PROJECT_NAME" NVARCHAR2(50) ,
  "PROJECT_ROLE" NVARCHAR2(100) ,
  "REQUEST" NCLOB ,
  "RESPONSE" NCLOB ,
  "RESOURCE_CODE" NVARCHAR2(200) ,
  "OPERATION_DETAIL" NCLOB
)');

proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','OPERATION_ITEM','操作事项');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','FUNCTION_MODULE','功能模块');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','UI_CATEGORY','界面分类');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','PROJECT_ORG_ID','组织机构id');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','ORG_NAME','组织机构');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','CREATOR_NAME','创建人英文名');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','CREATOR_NAME_CN','创建人中文名');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','SYS_ROLE','系统角色');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','OPERATION_IP','操作IP');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','PROJECT_ID','项目id');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','PROJECT_NAME','当前项目名');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','PROJECT_ROLE','项目角色');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','REQUEST','请求体，JSON对象');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','RESPONSE','返回体，JSON对象');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','RESOURCE_CODE','资源唯一编码,license控制使用');
proc_column_update ('modColumnComment','SYS_USER_OPERATION_LOG','OPERATION_DETAIL','操作详情模板，JSON对象');
proc_comment_table('SYS_USER_OPERATION_LOG','用户操作日志');
END;
/

BEGIN
  proc_create_table('SYS_ROLE',
  'CREATE TABLE "SYS_ROLE" (
  "ID" NUMBER(11) NOT NULL ,
  "NAME" NVARCHAR2(50) NOT NULL ,
  "REMARK" NVARCHAR2(200) ,
  "CODE" NVARCHAR2(255) ,
  "ROLE_SOURCE" NVARCHAR2(50),
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_ROLE','NAME','角色名称');
proc_column_update ('modColumnComment','SYS_ROLE','REMARK','备注');
proc_column_update ('modColumnComment','SYS_ROLE','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_comment_table('SYS_ROLE','角色');
proc_column_update ('modColumnComment','SYS_ROLE','ROLE_SOURCE','[GRAPH-图平台， EAP-知识抽取平台，KQA-知识问答]');
END;
/

-- DROP TABLE "SYS_ORG_ROLE";
BEGIN
  proc_create_table('SYS_ORG_ROLE',
'CREATE TABLE "SYS_ORG_ROLE" (
  "ID" NUMBER(11) NOT NULL ,
  "SYS_ROLE_ID" NUMBER(11) NOT NULL ,
  "SYS_ORG_ID" NUMBER(11) NOT NULL
)');

proc_column_update ('modColumnComment','SYS_ORG_ROLE','SYS_ROLE_ID','SYS_USER_ROLE.ID');
proc_column_update ('modColumnComment','SYS_ORG_ROLE','SYS_ORG_ID','SYS_ORG.ID');
proc_comment_table('SYS_ORG_ROLE','系统组织与系统角色');
END;
/

BEGIN
  proc_create_table('SYS_ROLE_RESOURCE',
  'CREATE TABLE "SYS_ROLE_RESOURCE" (
  "ID" NUMBER(11) NOT NULL ,
  "ROLE_ID" NUMBER(11) NOT NULL ,
  "RESOURCE_CODE" NVARCHAR2(256) NOT NULL
)');

proc_column_update ('modColumnComment','SYS_ROLE_RESOURCE','ROLE_ID','sys_role.id');
proc_column_update ('modColumnComment','SYS_ROLE_RESOURCE','RESOURCE_CODE','资源唯一编码,sys_resource.resource_code');
proc_comment_table('SYS_ROLE_RESOURCE','角色与资源');
END;
/


BEGIN
  proc_create_table('SYS_USER',
  'CREATE TABLE "SYS_USER" (
  "ID" NUMBER(11) NOT NULL ,
  "USER_NO" NVARCHAR2(128) NOT NULL ,
  "PASSWORD" NVARCHAR2(128) ,
  "NAME" NVARCHAR2(50) NOT NULL ,
  "PHONE" NVARCHAR2(20) ,
  "EMAIL" NVARCHAR2(128) ,
  "STATUS" NUMBER(4) NOT NULL ,
  "ATTR1" NVARCHAR2(255) ,
  "USER_SOURCE" NVARCHAR2(30) NOT NULL ,
  "LAST_LOGIN_TIME" DATE,
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE
)');

proc_create_unique_key ('SYS_USER','UK_SYS_USER','USER_NO');
proc_column_update ('modColumnProperty','SYS_USER','STATUS','DEFAULT 1');

proc_column_update ('modColumnComment','SYS_USER','USER_NO','用户名-登录');
proc_column_update ('modColumnComment','SYS_USER','PASSWORD','登录密码');
proc_column_update ('modColumnComment','SYS_USER','NAME','姓名');
proc_column_update ('modColumnComment','SYS_USER','PHONE','手机');
proc_column_update ('modColumnComment','SYS_USER','EMAIL','邮箱');
proc_column_update ('modColumnComment','SYS_USER','STATUS','状态，取值[1-正常，0-冻结]');
proc_column_update ('modColumnComment','SYS_USER','ATTR1','身份证号列名增加');
proc_column_update ('modColumnComment','SYS_USER','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_column_update ('modColumnComment','SYS_USER','USER_SOURCE','用户来源:[SSO-单点登录,SYS_CREATION-系统创建,EAP-知识抽取平台,KQA-知识问答]');
proc_column_update ('modColumnComment','SYS_USER','LAST_LOGIN_TIME','上次登陆时间');
proc_comment_table('SYS_USER','用户');

END;
/

-- drop table SYS_USER_SESSION;
BEGIN
  proc_create_table('SYS_USER_SESSION',
  'CREATE TABLE "SYS_USER_SESSION" (
    "ID" NUMBER(11) NOT NULL,
    "USER_ID" NUMBER(11),
    "SESSION_ID" NVARCHAR2(50),
    "SESSION_DATA" NCLOB,
    "ENABLED_FLAG" NCHAR(1) NOT NULL,
    "CREATED_BY" NVARCHAR2(50),
    "CREATED_DT" DATE,
    "UPDATED_BY" NVARCHAR2(50),
    "UPDATED_DT" DATE
)');

proc_comment_table('SYS_USER_SESSION','用户登录session信息表');
proc_column_update ('modColumnComment','SYS_USER_SESSION','USER_ID','SYS_USER.ID');
proc_column_update ('modColumnComment','SYS_USER_SESSION','SESSION_ID','用户登录sessionId');
proc_column_update ('modColumnComment','SYS_USER_SESSION','SESSION_DATA','用户登录session信息');
END;
/

-- drop table SYS_USER_LOGIN_INFO;
BEGIN
  proc_create_table('SYS_USER_LOGIN_INFO',
  'CREATE TABLE "SYS_USER_LOGIN_INFO" (
    "ID" NUMBER(11) NOT NULL,
    "USER_ID" NUMBER(11),
    "ROLE_ID" NUMBER(11),
    "CREATED_DT" DATE,
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_USER_LOGIN_INFO','USER_ID','登录用户ID，SYS_USER.ID');
proc_column_update ('modColumnComment','SYS_USER_LOGIN_INFO','ROLE_ID','用户当前登录角色ID，SYS_ROLE.ID');
proc_comment_table('SYS_USER_LOGIN_INFO','用户登录信息表');
END;
/


BEGIN
  proc_create_table('SYS_USER_ROLE',
  'CREATE TABLE "SYS_USER_ROLE" (
  "ID" NUMBER(11) NOT NULL ,
  "USER_ID" NUMBER(11) NOT NULL ,
  "ROLE_ID" NUMBER(11) NOT NULL ,
  "SOURCE_TYPE" NVARCHAR2(20) NOT NULL ,
  "SOURCE_ID" NUMBER(11);
)');

proc_column_update ('modColumnComment','SYS_USER_ROLE','USER_ID','SYS_USER.ID');
proc_column_update ('modColumnComment','SYS_USER_ROLE','ROLE_ID','SYS_ROLE.ID');
proc_column_update ('modColumnComment','SYS_USER_ROLE','SOURCE_TYPE','角色来源类型，SYS_ORG-系统组织，SYS_ROLE-系统管理-角色管理-添加的角色');
proc_column_update ('modColumnComment','SYS_USER_ROLE','SOURCE_ID','角色来源ID');
proc_comment_table('SYS_USER_ROLE','用户与角色');
END;
/

BEGIN
  proc_create_table('SYS_ORG',
  'CREATE TABLE "SYS_ORG" (
  "ID" NUMBER(11) NOT NULL ,
  "NAME" NVARCHAR2(50) NOT NULL ,
  "ORG_CODE" NVARCHAR2(256) ,
  "ORG_LEVEL" NUMBER(11) NOT NULL ,
  "REMARK" NVARCHAR2(500) ,
  "PARENT_IDS" NVARCHAR2(500) NOT NULL ,
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NVARCHAR2(50) ,
  "CREATED_DT" DATE ,
  "UPDATED_BY" NVARCHAR2(50) ,
  "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_ORG','NAME','系统组织名称');
proc_column_update ('modColumnComment','SYS_ORG','ORG_CODE','组织编码');
proc_column_update ('modColumnComment','SYS_ORG','ORG_LEVEL','系统组织层级，系统的默认顶级组织层级为0');
proc_column_update ('modColumnComment','SYS_ORG','REMARK','备注');
proc_column_update ('modColumnComment','SYS_ORG','PARENT_IDS','父节点id列表,样例:[1][2][3]');
proc_column_update ('modColumnComment','SYS_ORG','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_comment_table('SYS_ORG','系统组织');
END;
/

BEGIN
  proc_create_table('SYS_ORG_USER',
  'CREATE TABLE "SYS_ORG_USER" (
  "ID" NUMBER(11) NOT NULL ,
  "SYS_ORG_ID" NUMBER(11) NOT NULL ,
  "USER_ID" NUMBER(11) NOT NULL ,
  "STATUS"  NUMBER(4) NOT NULL
)');

proc_column_update ('modColumnComment','SYS_ORG_USER','SYS_ORG_ID','sys_org.id');
proc_column_update ('modColumnComment','SYS_ORG_USER','USER_ID','sys_user.id');
proc_column_update ('modColumnComment','SYS_ORG_USER','STATUS','状态:0-停用,1-正常');
proc_comment_table('SYS_ORG_USER','系统组织与成员');
END;
/

-- license
BEGIN
  proc_create_table('SYS_LICENSE',
  'CREATE TABLE "SYS_LICENSE" (
	"ID" NUMBER(11) NOT NULL ,
    "LICENSE_SERIAL_NO" NVARCHAR2(100),
    "LICENSE_CONTENT" NCLOB,
    "LICENSE_APPENDED" NCLOB,
    "ENABLED_FLAG" NCHAR(1)  NOT NULL ,
    "CREATED_BY" NVARCHAR2(50),
    "CREATED_DT" DATE,
    "UPDATED_BY" NVARCHAR2(50),
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_LICENSE','LICENSE_SERIAL_NO','授权证书编码');
proc_column_update ('modColumnComment','SYS_LICENSE','LICENSE_CONTENT','license加密内容');
proc_column_update ('modColumnComment','SYS_LICENSE','LICENSE_APPENDED','追加内容');
proc_column_update ('modColumnComment','SYS_LICENSE','ENABLED_FLAG','可用状态:Y-是;N-否');
proc_comment_table('SYS_LICENSE','license');
proc_column_update ('modColumnProperty','SYS_LICENSE','ENABLED_FLAG','DEFAULT ''Y''');

END;
/


-- license资源与系统资源关联表
BEGIN
  proc_create_table('SYS_LICENSE_RESOURCE',
  'CREATE TABLE "SYS_LICENSE_RESOURCE" (
	"ID" NUMBER(11) NOT NULL,
    "SYS_RESOURCE_CODE" NVARCHAR2(200),
    "PRODUCT_RESOURCE_CODE" NVARCHAR2(200),
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYS_LICENSE_RESOURCE','SYS_RESOURCE_CODE','系统资源唯一编码');
proc_column_update ('modColumnComment','SYS_LICENSE_RESOURCE','PRODUCT_RESOURCE_CODE','license资源唯一编码');
proc_comment_table('SYS_LICENSE_RESOURCE','license资源与系统资源关联表');
END;
/


-- 表：同步批次信息（sync_batch_info）
BEGIN
  proc_create_table('SYNC_BATCH_INFO',
  'CREATE TABLE "SYNC_BATCH_INFO" (
	"ID" NUMBER(11) NOT NULL,
    "BATCH_NO" NVARCHAR2(128),
    "SYNC_TYPE" NVARCHAR2(32),
    "STATE" NVARCHAR2(32),
    "CREATED_DT" DATE,
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SYNC_BATCH_INFO','BATCH_NO','同步批次');
proc_column_update ('modColumnComment','SYNC_BATCH_INFO','STATE','处理状态，值范围：pending-准备中、prepared-准备完成、synchronizing-同步中、synchronized-同步完成，sync_error-同步异常');
proc_column_update ('modColumnComment','SYNC_BATCH_INFO','SYNC_TYPE','同步类型 SYNC_ORIGIN_DATA-同步原始数据、SYNC_APP_SUB-同步统计应用子图对应的实体关系数量、SYNC_COMMON-同步统计通用图谱、SYNC_TABLE-同步统计表');
proc_column_update ('modColumnComment','SYNC_BATCH_INFO','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','SYNC_BATCH_INFO','UPDATED_DT','更新时间');
proc_comment_table('SYNC_BATCH_INFO','同步批次信息');
END;
/

-- 废弃的表
BEGIN
  -- 表：原始通用图谱信息(origin_common_graph);
  proc_drop_table('ORIGIN_COMMON_GRAPH');
  -- 表：原始应用子图信息(origin_app_sub_graph);
proc_drop_table('ORIGIN_APP_SUB_GRAPH');
  -- 表：通用图谱信息(common_graph);
proc_drop_table('COMMON_GRAPH');
  -- 表：应用子图信息(app_sub_graph);
proc_drop_table('APP_SUB_GRAPH');
END;
/



-- 表：原始表关系起点与终点
BEGIN
  proc_create_table('ORIGIN_EDGE_RELATION',
  'CREATE TABLE "ORIGIN_EDGE_RELATION" (
	  "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "TABLE_KEY" NVARCHAR2(128),
    "START_NODE_NAME" NVARCHAR2(128),
    "START_NODE_NAMECN" NVARCHAR2(128),
    "END_NODE_NAME" NVARCHAR2(128),
    "END_NODE_NAMECN" NVARCHAR2(128),
    "OP_TYPE" NVARCHAR2(32),
    "BATCH_NO" NVARCHAR2(128),
    "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','KEY','唯一标识');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','TABLE_KEY','关联表唯一标识');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','START_NODE_NAME','起点实体表英文名称');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','START_NODE_NAMECN','起点实体表中文名称');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','END_NODE_NAME','结束实体表英文名称');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','END_NODE_NAMECN','结束实体表中文名称');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','OP_TYPE','操作类型,值范围：upsert-新增或更新，delete-删除');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','BATCH_NO','同步批次');
proc_column_update ('modColumnComment','ORIGIN_EDGE_RELATION','CREATED_DT','创建时间');
proc_comment_table('ORIGIN_EDGE_RELATION','原始表关系起点与终点');
END;
/

-- 表：原始表信息(origin_table);
BEGIN
  proc_create_table('ORIGIN_TABLE',
  'CREATE TABLE "ORIGIN_TABLE" (
	"ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "GRAPH_KEY" NVARCHAR2(128),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "AMOUNT" NUMBER,
    "OP_TYPE" NVARCHAR2(32),
    "BATCH_NO" NVARCHAR2(128),
    "DIRECTED" NUMBER(1),
    "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','ORIGIN_TABLE','KEY','表唯一标识');
proc_column_update ('modColumnComment','ORIGIN_TABLE','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','ORIGIN_TABLE','NAME','表英文名称');
proc_column_update ('modColumnComment','ORIGIN_TABLE','GRAPH_KEY','关联图谱唯一标识');
proc_column_update ('modColumnComment','ORIGIN_TABLE','TYPE','表类型，值范围：node-实体，edge-关系');
proc_column_update ('modColumnComment','ORIGIN_TABLE','DESCR','表描述');
proc_column_update ('modColumnComment','ORIGIN_TABLE','AMOUNT','记录条数');
proc_column_update ('modColumnComment','ORIGIN_TABLE','OP_TYPE','操作类型,值范围：upsert-新增或更新，delete-删除');
proc_column_update ('modColumnComment','ORIGIN_TABLE','DIRECTED','是否有方向');
proc_column_update ('modColumnComment','ORIGIN_TABLE','BATCH_NO','同步批次');
proc_column_update ('modColumnComment','ORIGIN_TABLE','CREATED_DT','创建时间');
proc_comment_table('ORIGIN_TABLE','原始表信息');
END;
/

-- 表：原始表字段版本信息(origin_field);
BEGIN
  proc_create_table('ORIGIN_FIELD',
  'CREATE TABLE "ORIGIN_FIELD" (
	"ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "TABLE_KEY" NVARCHAR2(128),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "OP_TYPE" NVARCHAR2(32),
    "BATCH_NO" NVARCHAR2(128);
)');

proc_column_update ('modColumnComment','ORIGIN_FIELD','KEY','表唯一标识');
proc_column_update ('modColumnComment','ORIGIN_FIELD','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','ORIGIN_FIELD','NAME','表英文名称');
proc_column_update ('modColumnComment','ORIGIN_FIELD','TABLE_KEY','引用原始表的key字段');
proc_column_update ('modColumnComment','ORIGIN_FIELD','TYPE','字段类型');
proc_column_update ('modColumnComment','ORIGIN_FIELD','DESCR','字段描述');
proc_column_update ('modColumnComment','ORIGIN_FIELD','OP_TYPE','操作类型,值范围：upsert-新增或更新，delete-删除');
proc_column_update ('modColumnComment','ORIGIN_FIELD','BATCH_NO','同步批次');
proc_comment_table('ORIGIN_FIELD','原始表字段版本信息');
END;
/

-- 表：图谱信息(graph);
BEGIN
  proc_create_table('GRAPH',
  'CREATE TABLE "GRAPH" (
	"ID" NUMBER(11) NOT NULL,
	"TYPE" NVARCHAR2(32),
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "SPACE_ID" NUMBER(11),
    "NODE_TYPE_COUNT" NUMBER(11),
    "NODE_AMOUNT" NUMBER(11),
    "EDGE_TYPE_COUNT" NUMBER(11),
    "EDGE_AMOUNT" NUMBER(11),
    "EDGE_AND_NODE_TYPE_TOTAL" NUMBER(11),
    "EDGE_AND_NODE_TOTAL" NUMBER(11),
    "ORG_ID" NUMBER(11),
    "CREATED_DT" DATE,
    "UPDATED_DT" DATE
)');
proc_column_update ('modColumnProperty','GRAPH','NODE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH','NODE_AMOUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH','EDGE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH','EDGE_AMOUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH','EDGE_AND_NODE_TYPE_TOTAL','default 0');
proc_column_update ('modColumnProperty','GRAPH','EDGE_AND_NODE_TOTAL','default 0');

proc_column_update ('modColumnComment','GRAPH','TYPE','图谱类型');
proc_column_update ('modColumnComment','GRAPH','KEY','图谱唯一标识');
proc_column_update ('modColumnComment','GRAPH','NAME_CN','图谱中文名称');
proc_column_update ('modColumnComment','GRAPH','NAME','图谱英文名称');
proc_column_update ('modColumnComment','GRAPH','SPACE_ID','子图空间ID');
proc_column_update ('modColumnComment','GRAPH','NODE_TYPE_COUNT','实体类型数量');
proc_column_update ('modColumnComment','GRAPH','NODE_AMOUNT','实体数据量');
proc_column_update ('modColumnComment','GRAPH','EDGE_TYPE_COUNT','关系类型数量');
proc_column_update ('modColumnComment','GRAPH','EDGE_AMOUNT','关系数据量');
proc_column_update ('modColumnComment','GRAPH','EDGE_AND_NODE_TYPE_TOTAL','实体关系类型总数据量');
proc_column_update ('modColumnComment','GRAPH','EDGE_AND_NODE_TOTAL','实体关系总数据量');
proc_column_update ('modColumnComment','GRAPH','ORG_ID','所属组织ID');
proc_column_update ('modColumnComment','GRAPH','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','GRAPH','UPDATED_DT','更新时间');
proc_comment_table('GRAPH','应用子图信息');
END;
/

-- 表：图谱表版本信息(GRAPH_TABLE_VERSION);
BEGIN
  proc_create_table('GRAPH_TABLE_VERSION',
  'CREATE TABLE "GRAPH_TABLE_VERSION" (
    "ID" NUMBER(11) NOT NULL,
    "TABLE_KEY" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "VERSION_NUM" NUMBER(11),
    "CREATED_BY" NUMBER(11),
    "CREATED_DT" DATE
)');
proc_column_update ('modColumnName','GRAPH_TABLE_VERSION','VERSION','NAME');
proc_column_update ('modColumnComment','GRAPH_TABLE_VERSION','NAME','版本号');

proc_column_update ('modColumnComment','GRAPH_TABLE_VERSION','TABLE_KEY','表唯一标识');
proc_column_update ('modColumnComment','GRAPH_TABLE_VERSION','NAME','版本号');
proc_column_update ('modColumnComment','GRAPH_TABLE_VERSION','CREATED_BY','创建用户ID');
proc_column_update ('modColumnComment','GRAPH_TABLE_VERSION','CREATED_DT','创建时间');
proc_comment_table('GRAPH_TABLE_VERSION','图谱表版本信息');
END;
/

-- 表：图谱表信息(GRAPH_TABLE);
BEGIN
  proc_create_table('GRAPH_TABLE',
  'CREATE TABLE "GRAPH_TABLE" (
    "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "GRAPH_ID" NUMBER(11),
    "GRAPH_TYPE" NVARCHAR2(32),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "FIELD_NUM" NUMBER,
    "AMOUNT" NUMBER,
    "COMMON_GRAPH_COUNT" NUMBER(11),
    "APP_SUB_GRAPH_COUNT" NUMBER(11),
    "VERSION_ID" NUMBER(11),
    "DIRECTED" NUMBER(1),
    "CREATED_DT" DATE,
    "UPDATED_DT" DATE
)');
proc_column_update ('modColumnProperty','GRAPH_TABLE','FIELD_NUM','default 0');
proc_column_update ('modColumnProperty','GRAPH_TABLE','AMOUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH_TABLE','COMMON_GRAPH_COUNT','default 0');
proc_column_update ('modColumnProperty','GRAPH_TABLE','APP_SUB_GRAPH_COUNT','default 0');

proc_column_update ('modColumnComment','GRAPH_TABLE','KEY','表唯一标识');
proc_column_update ('modColumnComment','GRAPH_TABLE','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','GRAPH_TABLE','NAME','表英文名称');
proc_column_update ('modColumnComment','GRAPH_TABLE','GRAPH_ID','关联图谱唯一标识');
proc_column_update ('modColumnComment','GRAPH_TABLE','GRAPH_TYPE','关联图谱类型，值范围：common-通用图谱，app_sub-应用子图');
proc_column_update ('modColumnComment','GRAPH_TABLE','TYPE','表类型，值范围：node-实体，edge-关系');
proc_column_update ('modColumnComment','GRAPH_TABLE','DESCR','表描述');
proc_column_update ('modColumnComment','GRAPH_TABLE','FIELD_NUM','字段数量');
proc_column_update ('modColumnComment','GRAPH_TABLE','AMOUNT','记录条数');
proc_column_update ('modColumnComment','GRAPH_TABLE','COMMON_GRAPH_COUNT','关联通用图谱数量');
proc_column_update ('modColumnComment','GRAPH_TABLE','APP_SUB_GRAPH_COUNT','关联应用子图数量');
proc_column_update ('modColumnComment','GRAPH_TABLE','VERSION_ID','关联版本ID');
proc_column_update ('modColumnComment','GRAPH_TABLE','DIRECTED','是否有方向');
proc_column_update ('modColumnComment','GRAPH_TABLE','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','GRAPH_TABLE','UPDATED_DT','更新时间');
proc_comment_table('GRAPH_TABLE','图谱表信息');
END;
/

-- 表：表关系起点与终点
BEGIN
  proc_create_table('EDGE_RELATION',
  'CREATE TABLE "EDGE_RELATION" (
    "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "EDGE_ID" NUMBER(11) NOT NULL,
    "START_NODE_ID" NUMBER(11) NOT NULL,
    "START_NODE_NAME" NVARCHAR2(128),
    "START_NODE_NAMECN" NVARCHAR2(128),
    "END_NODE_ID" NUMBER(11) NOT NULL,
    "END_NODE_NAME" NVARCHAR2(128),
    "END_NODE_NAMECN" NVARCHAR2(128),
    "TABLE_KEY" NVARCHAR2(128),
    "CREATED_DT" DATE
)');
proc_column_update ('addColumn','EDGE_RELATION','EDGE_ID', 'NUMBER(11)');
proc_column_update ('addColumn','EDGE_RELATION','START_NODE_ID', 'NUMBER(11)');
proc_column_update ('addColumn','EDGE_RELATION','END_NODE_ID', 'NUMBER(11)');
proc_column_update ('addColumn','EDGE_RELATION','TABLE_KEY', 'NVARCHAR2(128)');

proc_column_update ('modColumnComment','EDGE_RELATION','KEY','关联表唯一标识');
proc_column_update ('modColumnComment','EDGE_RELATION','EDGE_ID','关系表ID');
proc_column_update ('modColumnComment','EDGE_RELATION','START_NODE_ID','起点实体表ID');
proc_column_update ('modColumnComment','EDGE_RELATION','START_NODE_NAME','起点实体表英文名称');
proc_column_update ('modColumnComment','EDGE_RELATION','START_NODE_NAMECN','起点实体表中文名称');
proc_column_update ('modColumnComment','EDGE_RELATION','END_NODE_NAME','结束实体表英文名称');
proc_column_update ('modColumnComment','EDGE_RELATION','END_NODE_NAMECN','结束实体表中文名称');
proc_column_update ('modColumnComment','EDGE_RELATION','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','EDGE_RELATION','TABLE_KEY','关联表key');
proc_comment_table('EDGE_RELATION','关系起点与终点');
END;
/

-- 表：表关系起点与终点历史版本（关系表实体对历史版本）
BEGIN
  proc_create_table('EDGE_RELATION_HISTORY',
  'CREATE TABLE "EDGE_RELATION_HISTORY" (
	"ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
	"TABLE_HISTORY_ID" NUMBER(11),
	"EDGE_ID" NUMBER(11),
	"START_NODE_ID" NUMBER(11),
    "START_NODE_NAME" NVARCHAR2(128),
    "START_NODE_NAMECN" NVARCHAR2(128),
	"END_NODE_ID" NUMBER(11),
    "END_NODE_NAME" NVARCHAR2(128),
    "END_NODE_NAMECN" NVARCHAR2(128),
    "TABLE_KEY" NVARCHAR2(128),
    "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','KEY','关联表唯一标识');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','TABLE_HISTORY_ID','关系表历史记录ID');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','EDGE_ID','关系表ID');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','START_NODE_NAME','起点实体表英文名称');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','START_NODE_NAMECN','起点实体表中文名称');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','END_NODE_NAME','结束实体表英文名称');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','END_NODE_NAMECN','结束实体表中文名称');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','EDGE_RELATION_HISTORY','TABLE_KEY','关联表key');
proc_comment_table('EDGE_RELATION_HISTORY','关系起点与终点历史版本');
END;
/

-- 表：图谱表历史版本信息(GRAPH_TABLE_HISTORY);
BEGIN
  proc_create_table('GRAPH_TABLE_HISTORY',
  'CREATE TABLE "GRAPH_TABLE_HISTORY" (
    "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "GRAPH_ID" NUMBER(11),
    "GRAPH_TYPE" NVARCHAR2(32),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "AMOUNT" NUMBER,
    "COMMON_GRAPH_COUNT" NUMBER(11),
    "APP_SUB_GRAPH_COUNT" NUMBER(11),
    "VERSION_ID" NUMBER(11),
    "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','KEY','表唯一标识');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','NAME','表英文名称');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','GRAPH_ID','关联图谱唯一标识');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','GRAPH_TYPE','关联图谱类型，值范围：common-通用图谱，app_sub-应用子图');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','TYPE','表类型，值范围：node-实体，edge-关系');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','DESCR','表描述');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','AMOUNT','记录条数');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','COMMON_GRAPH_COUNT','关联通用图谱数量');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','APP_SUB_GRAPH_COUNT','关联应用子图数量');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','VERSION_ID','关联版本ID');
proc_column_update ('modColumnComment','GRAPH_TABLE_HISTORY','CREATED_DT','创建时间');
proc_comment_table('GRAPH_TABLE_HISTORY','图谱表历史版本信息');
END;
/

-- 表：表字段信息(graph_field);
BEGIN
  proc_create_table('GRAPH_FIELD',
  'CREATE TABLE "GRAPH_FIELD" (
    "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "TABLE_ID" NUMBER(11),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "CREATED_DT" DATE,
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','GRAPH_FIELD','KEY','表唯一标识');
proc_column_update ('modColumnComment','GRAPH_FIELD','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','GRAPH_FIELD','NAME','表英文名称');
proc_column_update ('modColumnComment','GRAPH_FIELD','TABLE_ID','关联表的ID');
proc_column_update ('modColumnComment','GRAPH_FIELD','TYPE','字段类型');
proc_column_update ('modColumnComment','GRAPH_FIELD','DESCR','字段描述');
proc_column_update ('modColumnComment','GRAPH_FIELD','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','GRAPH_FIELD','UPDATED_DT','更新时间');
proc_comment_table('GRAPH_FIELD','表字段信息');
END;
/

-- 表：表字段历史版本信息(graph_field_history);
BEGIN
  proc_create_table('GRAPH_FIELD_HISTORY',
  'CREATE TABLE "GRAPH_FIELD_HISTORY" (
    "ID" NUMBER(11) NOT NULL,
    "KEY" NVARCHAR2(128),
    "NAME_CN" NVARCHAR2(128),
    "NAME" NVARCHAR2(128),
    "TABLE_HISTORY_ID" NUMBER(11),
    "TYPE" NVARCHAR2(32),
    "DESCR" NVARCHAR2(1024),
    "CREATED_DT" DATE
)');

proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','KEY','表唯一标识');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','NAME','表英文名称');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','TABLE_HISTORY_ID','关联表历史版本的ID');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','TYPE','字段类型');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','DESCR','字段描述');
proc_column_update ('modColumnComment','GRAPH_FIELD_HISTORY','CREATED_DT','创建时间');
proc_comment_table('GRAPH_FIELD_HISTORY','表字段历史版本信息');
END;
/
-- 子图空间详情表
BEGIN
  proc_create_table('SUB_GRAPH_SPACE',
'CREATE TABLE "SUB_GRAPH_SPACE" (
  "ID" NUMBER(11) NOT NULL,
  "ORG_ID" NUMBER(11),
  "NAME" NVARCHAR2(56),
  "BUSINESS_AREA" NVARCHAR2(100),
  "APPLY_SCENE" NVARCHAR2(100),
  "CLOUD_NODE" NVARCHAR2(35),
  "GRAPH_SERVER" NVARCHAR2(35),
  "DATA_SOURCE" NVARCHAR2(255),
  "ENABLED_FLAG" NCHAR(1) NOT NULL ,
  "CREATED_BY" NUMBER(11),
  "CREATED_DT" DATE,
  "UPDATED_BY" NUMBER(11),
  "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','ID','主键');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','ORG_ID','组织ID');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','NAME','子图空间名称');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','BUSINESS_AREA','业务领域');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','APPLY_SCENE','应用场景');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','CLOUD_NODE','大数据云节点');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','GRAPH_SERVER','图库服务器');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','DATA_SOURCE','数据来源 数组json格式存储');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','ENABLED_FLAG','是否可用状态');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','CREATED_BY','创建人');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','CREATED_DT','创建时间');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','UPDATED_BY','修改人');
proc_column_update ('modColumnComment','SUB_GRAPH_SPACE','UPDATED_DT','修改时间');
proc_comment_table('SUB_GRAPH_SPACE','子图空间详情表');
END;
/

-- 子图空间申请记录表
BEGIN
  proc_create_table('SUB_GRAPH_APPLY',
'CREATE TABLE "SUB_GRAPH_APPLY" (
  "ID" NUMBER(11) NOT NULL,
  "SPACE_ID" NUMBER(11),
  "APPLY_NO" NVARCHAR2(56),
  "ORG_ID" NUMBER(11),
  "NAME" NVARCHAR2(56),
  "BUSINESS_AREA" NVARCHAR2(100),
  "APPLY_SCENE" NVARCHAR2(100),
  "CLOUD_NODE" NVARCHAR2(35),
  "GRAPH_SERVER" NVARCHAR2(35),
  "DATA_SOURCE" NVARCHAR2(255),
  "REASON" NVARCHAR2(255),
  "APPLY_TYPE" NVARCHAR2(56),
  "STATUS" NVARCHAR2(35),
  "CREATED_BY" NUMBER(11),
  "CREATED_DT" DATE,
  "UPDATED_BY" NUMBER(11),
  "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','ID','主键');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','SPACE_ID','关联子图空间ID变更的时候使用');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','APPLY_NO','申请ID');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','ORG_ID','组织ID');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','NAME','子图空间名称');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','BUSINESS_AREA','业务领域');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','APPLY_SCENE','应用场景');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','CLOUD_NODE','大数据云节点');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','GRAPH_SERVER','图库服务器');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','DATA_SOURCE','数据来源 数组json格式存储');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','APPLY_TYPE','申请类型 CREATED 新建;UPDATED 修改;DELETE 删除');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','STATUS','状态 INIT 待审批 APPROVAL_COMPLETED 审批完成 REJECT 驳回');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','CREATED_DT','申请时间');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','CREATED_BY','申请人');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','UPDATED_BY','审批人');
proc_column_update ('modColumnComment','SUB_GRAPH_APPLY','UPDATED_DT','审批时间');
proc_comment_table('SUB_GRAPH_APPLY','子图空间申请记录表');
END;
/

-- 审批表
BEGIN
  proc_create_table('EXAMINE_APPROVE_RECORD',
'CREATE TABLE "EXAMINE_APPROVE_RECORD" (
    "ID" NUMBER(11) NOT NULL,
    "APPLY_ID" NUMBER(11),
    "STATUS" NVARCHAR2(35),
    "APPROVAL_MSG" NVARCHAR2(255),
    "APPROVE_TYPE" NVARCHAR2(35),
    "REASON" NVARCHAR2(255),
    "UPDATED_BY" NUMBER(11),
    "UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','ID','主键');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','APPLY_ID','申请表ID');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','STATUS','状态 APPROVAL_PENDING 待审批 APPROVED 审批完成 REJECT 驳回');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','APPROVAL_MSG','审批描述');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','APPROVE_TYPE','审批类型');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','UPDATED_BY','审批人');
proc_column_update ('modColumnComment','EXAMINE_APPROVE_RECORD','UPDATED_DT','审批时间');
proc_comment_table('EXAMINE_APPROVE_RECORD','审批表');
END;
/

-- 本体申请，本体可视为图谱本体
-- drop table ONT_GRAPH_APPLY;
BEGIN
  proc_create_table('ONT_GRAPH_APPLY',
'CREATE TABLE "ONT_GRAPH_APPLY" (
"ID" NUMBER(11) NOT NULL,
"APPLY_NO" NVARCHAR2(128),
"APPLY_TYPE" NVARCHAR2(128),
"TYPE" NVARCHAR2(32),
"GRAPH_ID" NUMBER(11),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"DESIGN_TYPE" NVARCHAR2(128),
"APPLY_SCENE" NVARCHAR2(1024),
"SUB_GRAPH_ID" NUMBER(11),
"ORG_ID" NUMBER(11),
"REASON" NVARCHAR2(1024),
"EXTRA_GRAPH_INFO" NVARCHAR2(1024),
"AUDIT_STATE" NVARCHAR2(32),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','APPLY_NO','申请ID');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','APPLY_TYPE','申请类型');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','TYPE','本体类型');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','GRAPH_ID','本体ID');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','NAME','本体英文名称');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','NAME_CN','本体中文名称');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','DESIGN_TYPE','设计方式，ONLINE-在线设计,UPLOAD-上传模型');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','APPLY_SCENE','应用场景');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','SUB_GRAPH_ID','子图空间');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','ORG_ID','创建组织');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','REASON','申请原因，等同变更原因、删除原因');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','EXTRA_GRAPH_INFO','额外图谱信息');
proc_column_update ('modColumnComment','ONT_GRAPH_APPLY','AUDIT_STATE','审批状态');
proc_comment_table('ONT_GRAPH_APPLY','本体申请，本体可视为图谱本体');
END;
/
-- 本体，本体可视为图谱本体
-- drop table ONT_GRAPH;
BEGIN
  proc_create_table('ONT_GRAPH',
'CREATE TABLE "ONT_GRAPH" (
"ID" NUMBER(11) NOT NULL,
"TYPE" NVARCHAR2(32),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"APPLY_SCENE" NVARCHAR2(1024),
"SUB_GRAPH_ID" NUMBER(11),
"ORG_ID" NUMBER(11),
"EXTRA_GRAPH_INFO" NVARCHAR2(1024),
"DESIGN_TYPE" NVARCHAR2(128),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_GRAPH','TYPE','本体类型');
proc_column_update ('modColumnComment','ONT_GRAPH','NAME','本体英文名称');
proc_column_update ('modColumnComment','ONT_GRAPH','NAME_CN','本体中文名称');
proc_column_update ('modColumnComment','ONT_GRAPH','APPLY_SCENE','应用场景');
proc_column_update ('modColumnComment','ONT_GRAPH','SUB_GRAPH_ID','子图空间');
proc_column_update ('modColumnComment','ONT_GRAPH','ORG_ID','创建组织');
proc_column_update ('modColumnComment','ONT_GRAPH','EXTRA_GRAPH_INFO','额外图谱信息');
proc_column_update ('modColumnComment','ONT_GRAPH','DESIGN_TYPE','设计方式，ONLINE-在线设计,UPLOAD-上传模型');
proc_comment_table('ONT_GRAPH','本体，本体可视为图谱本体');
END;
/
-- 本体表
-- drop table ONT_SCHEMA;
BEGIN
  proc_create_table('ONT_SCHEMA',
'CREATE TABLE "ONT_SCHEMA" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"DESCR" NVARCHAR2(1024),
"TYPE" NVARCHAR2(32),
"DIRECTED" NUMBER(1),
"GRAPH_TYPE" NVARCHAR2(32),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_SCHEMA','GRAPH_ID','图ID');
proc_column_update ('modColumnComment','ONT_SCHEMA','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA','NAME','表英文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA','DESCR','描述');
proc_column_update ('modColumnComment','ONT_SCHEMA','TYPE','类型');
proc_column_update ('modColumnComment','ONT_SCHEMA','GRAPH_TYPE','图谱类型');
proc_column_update ('modColumnComment','ONT_SCHEMA','DIRECTED','是否有方向');
proc_comment_table('ONT_SCHEMA','本体表');
END;
/
-- 本体关系实体
-- drop table ONT_EDGE_NODE;
BEGIN
  proc_create_table('ONT_EDGE_NODE',
'CREATE TABLE "ONT_EDGE_NODE" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"EDGE_ID" NUMBER(11),
"EDGE" NVARCHAR2(128),
"START_NODE_ID" NUMBER(11),
"START_NODE" NVARCHAR2(128),
"END_NODE_ID" NUMBER(11),
"END_NODE" NVARCHAR2(128),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_EDGE_NODE','GRAPH_ID','图本体ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','EDGE_ID','关系表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','EDGE','关系表英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','START_NODE_ID','起点实体表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','START_NODE','起点实体表英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','END_NODE_ID','终点实体表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE','END_NODE','终点实体表英文名称');
proc_comment_table('ONT_EDGE_NODE','本体关系实体');
END;
/
-- 本体字段
-- drop table ONT_FIELD;
BEGIN
  proc_create_table('ONT_FIELD',
'CREATE TABLE "ONT_FIELD" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"SCHEMA_ID" NUMBER(11),
"SCHEMA" NVARCHAR2(128),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"DESCR" NVARCHAR2(1024),
"TYPE" NVARCHAR2(32),
"IS_MAIN" NUMBER(1),
"IS_IDENTITY" NUMBER(1),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_FIELD','GRAPH_ID','图ID');
proc_column_update ('modColumnComment','ONT_FIELD','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_FIELD','SCHEMA_ID','表ID');
proc_column_update ('modColumnComment','ONT_FIELD','SCHEMA','表英文名称');
proc_column_update ('modColumnComment','ONT_FIELD','NAME','字段英文名称');
proc_column_update ('modColumnComment','ONT_FIELD','NAME_CN','字段中文名称');
proc_column_update ('modColumnComment','ONT_FIELD','DESCR','描述');
proc_column_update ('modColumnComment','ONT_FIELD','TYPE','字段类型');
proc_column_update ('modColumnComment','ONT_FIELD','IS_MAIN','是否为主标识，取值[0-否，1-是]');
proc_column_update ('modColumnComment','ONT_FIELD','IS_IDENTITY','是否为实体标识，取值[0-否，1-是]');
proc_comment_table('ONT_FIELD','本体字段');
END;
/
-- 本体历史版本
-- drop table ONT_GRAPH_VERSION;
BEGIN
  proc_create_table('ONT_GRAPH_VERSION',
'CREATE TABLE "ONT_GRAPH_VERSION" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"NAME" NVARCHAR2(128),
"IS_CURRENT" NUMBER(1),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_GRAPH_VERSION','GRAPH_ID','图本体ID');
proc_column_update ('modColumnComment','ONT_GRAPH_VERSION','NAME','版本名称');
proc_column_update ('modColumnComment','ONT_GRAPH_VERSION','IS_CURRENT','是否当前版本');
proc_comment_table('ONT_GRAPH_VERSION','本体历史版本');
END;
/
-- 本体表历史版本
-- drop table ONT_GRAPH_HISTORY;
BEGIN
  proc_create_table('ONT_GRAPH_HISTORY',
'CREATE TABLE "ONT_GRAPH_HISTORY" (
"ID" NUMBER(11) NOT NULL,
"TYPE" NVARCHAR2(32),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"APPLY_SCENE" NVARCHAR2(1024),
"SUB_GRAPH_ID" NUMBER(11),
"ORG_ID" NUMBER(11),
"EXTRA_GRAPH_INFO" NVARCHAR2(1024),
"DESIGN_TYPE" NVARCHAR2(128),
"VERSION_ID" NUMBER(11) NOT NULL,
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','TYPE','本体类型');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','NAME','本体英文名称');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','NAME_CN','本体中文名称');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','APPLY_SCENE','应用场景');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','SUB_GRAPH_ID','子图空间');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','ORG_ID','创建组织');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','EXTRA_GRAPH_INFO','额外图谱信息');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','DESIGN_TYPE','设计方式，ONLINE-在线设计,UPLOAD-上传模型');
proc_column_update ('modColumnComment','ONT_GRAPH_HISTORY','VERSION_ID','版本ID');
proc_comment_table('ONT_GRAPH_HISTORY','本体，本体可视为图谱本体');
END;
/
-- 本体表历史
-- drop table ONT_SCHEMA_HISTORY;
BEGIN
  proc_create_table('ONT_SCHEMA_HISTORY',
'CREATE TABLE "ONT_SCHEMA_HISTORY" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"DESCR" NVARCHAR2(1024),
"TYPE" NVARCHAR2(32),
"DIRECTED" NUMBER(1),
"VERSION_ID" NUMBER(11),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','GRAPH_ID','图ID');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','NAME','表英文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','NAME_CN','表中文名称');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','DESCR','描述');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','TYPE','类型');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','DIRECTED','是否有方向');
proc_column_update ('modColumnComment','ONT_SCHEMA_HISTORY','VERSION_ID','版本ID');
proc_comment_table('ONT_SCHEMA_HISTORY','本体表');
END;
/
-- 本体关系实体历史
-- drop table ONT_EDGE_NODE_HISTORY;
BEGIN
  proc_create_table('ONT_EDGE_NODE_HISTORY',
'CREATE TABLE "ONT_EDGE_NODE_HISTORY" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"EDGE_ID" NUMBER(11),
"EDGE" NVARCHAR2(128),
"START_NODE_ID" NUMBER(11),
"START_NODE" NVARCHAR2(128),
"END_NODE_ID" NUMBER(11),
"END_NODE" NVARCHAR2(128),
"VERSION_ID" NUMBER(11),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','GRAPH_ID','图本体ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','EDGE_ID','关系表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','EDGE','关系表英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','START_NODE_ID','起点实体表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','START_NODE','起点实体表英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','END_NODE_ID','终点实体表ID');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','END_NODE','终点实体表英文名称');
proc_column_update ('modColumnComment','ONT_EDGE_NODE_HISTORY','VERSION_ID','版本ID');
proc_comment_table('ONT_EDGE_NODE_HISTORY','本体关系实体');
END;
/
-- 本体字段历史
-- drop table ONT_FIELD_HISTORY;
BEGIN
  proc_create_table('ONT_FIELD_HISTORY',
'CREATE TABLE "ONT_FIELD_HISTORY" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH" NVARCHAR2(128),
"SCHEMA_ID" NUMBER(11),
"SCHEMA" NVARCHAR2(128),
"NAME" NVARCHAR2(128),
"NAME_CN" NVARCHAR2(128),
"DESCR" NVARCHAR2(1024),
"TYPE" NVARCHAR2(32),
"IS_MAIN" NUMBER(1),
"IS_IDENTITY" NUMBER(1),
"VERSION_ID" NUMBER(11),
"ENABLED_FLAG" NCHAR(1) NOT NULL ,
"CREATED_BY" NVARCHAR2(50) ,
"CREATED_DT" DATE ,
"UPDATED_BY" NVARCHAR2(50) ,
"UPDATED_DT" DATE
)');

proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','GRAPH_ID','图ID');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','GRAPH','图英文名称');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','SCHEMA_ID','表ID');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','SCHEMA','表英文名称');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','NAME','字段英文名称');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','NAME_CN','字段中文名称');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','DESCR','描述');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','TYPE','字段类型');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','IS_MAIN','是否为主标识，取值[0-否，1-是]');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','IS_IDENTITY','是否为实体标识，取值[0-否，1-是]');
proc_column_update ('modColumnComment','ONT_FIELD_HISTORY','VERSION_ID','版本ID');
proc_comment_table('ONT_FIELD_HISTORY','本体字段');
END;
/

-- 表数据日统计
-- drop table TABLE_DAY_STATIS;
BEGIN
  proc_create_table('TABLE_DAY_STATIS',
'CREATE TABLE "TABLE_DAY_STATIS" (
"ID" NUMBER(11) NOT NULL,
"TABLE_ID" NUMBER(11),
"TABLE_TYPE" NVARCHAR2(128),
"DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','TABLE_DAY_STATIS','DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','TABLE_DAY_STATIS','ID','id');
proc_column_update ('modColumnComment','TABLE_DAY_STATIS','TABLE_ID','表ID');
proc_column_update ('modColumnComment','TABLE_DAY_STATIS','TABLE_TYPE','表类型');
proc_column_update ('modColumnComment','TABLE_DAY_STATIS','DATA_AMOUNT','数据条数');
proc_column_update ('modColumnComment','TABLE_DAY_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('TABLE_DAY_STATIS','表数据日统计');
END;
/
-- 表数据月统计
-- drop table TABLE_MONTH_STATIS;
BEGIN
  proc_create_table('TABLE_MONTH_STATIS',
'CREATE TABLE "TABLE_MONTH_STATIS" (
"ID" NUMBER(11) NOT NULL,
"TABLE_ID" NUMBER(11),
"TABLE_TYPE" NVARCHAR2(128),
"DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','TABLE_MONTH_STATIS','DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','TABLE_MONTH_STATIS','ID','id');
proc_column_update ('modColumnComment','TABLE_MONTH_STATIS','TABLE_ID','表ID');
proc_column_update ('modColumnComment','TABLE_MONTH_STATIS','TABLE_TYPE','表类型');
proc_column_update ('modColumnComment','TABLE_MONTH_STATIS','DATA_AMOUNT','数据条数');
proc_column_update ('modColumnComment','TABLE_MONTH_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('TABLE_MONTH_STATIS','表数据月统计');
END;
/
-- 图谱数据月统计
-- drop table GRAPH_MONTH_STATIS;
BEGIN
  proc_create_table('GRAPH_MONTH_STATIS',
'CREATE TABLE "GRAPH_MONTH_STATIS" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH_TYPE" NVARCHAR2(128),
"DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','GRAPH_MONTH_STATIS','DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','GRAPH_MONTH_STATIS','ID','id');
proc_column_update ('modColumnComment','GRAPH_MONTH_STATIS','GRAPH_ID','图谱ID');
proc_column_update ('modColumnComment','GRAPH_MONTH_STATIS','GRAPH_TYPE','图谱类型');
proc_column_update ('modColumnComment','GRAPH_MONTH_STATIS','DATA_AMOUNT','数据条数');
proc_column_update ('modColumnComment','GRAPH_MONTH_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('GRAPH_MONTH_STATIS','图谱数据月统计');
END;
/
-- 图谱数据日统计
-- drop table GRAPH_DAY_STATIS;
BEGIN
  proc_create_table('GRAPH_DAY_STATIS',
'CREATE TABLE "GRAPH_DAY_STATIS" (
"ID" NUMBER(11) NOT NULL,
"GRAPH_ID" NUMBER(11),
"GRAPH_TYPE" NVARCHAR2(128),
"DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','GRAPH_DAY_STATIS','DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','GRAPH_DAY_STATIS','ID','id');
proc_column_update ('modColumnComment','GRAPH_DAY_STATIS','GRAPH_ID','图谱ID');
proc_column_update ('modColumnComment','GRAPH_DAY_STATIS','GRAPH_TYPE','图谱类型');
proc_column_update ('modColumnComment','GRAPH_DAY_STATIS','DATA_AMOUNT','数据条数');
proc_column_update ('modColumnComment','GRAPH_DAY_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('GRAPH_DAY_STATIS','图谱数据日统计');
END;
/
-- 图谱概要数据日统计
-- drop table SUMMARY_DAY_STATIS;
BEGIN
  proc_create_table('SUMMARY_DAY_STATIS',
'CREATE TABLE "SUMMARY_DAY_STATIS" (
"ID" NUMBER(11) NOT NULL,
"BASE_GROUP_NODE_TYPE_COUNT" NUMBER(11),
"BASE_GROUP_EDGE_TYPE_COUNT" NUMBER(11),
"COMMON_GROUP_COUNT" NUMBER(11),
"APP_SUB_GROUP_COUNT" NUMBER(11),
"BASE_GROUP_DATA_AMOUNT" NUMBER(11),
"COMMON_GROUP_DATA_AMOUNT" NUMBER(11),
"APP_SUB_GROUP_DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','BASE_GROUP_NODE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','BASE_GROUP_EDGE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','COMMON_GROUP_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','APP_SUB_GROUP_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','COMMON_GROUP_DATA_AMOUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_DAY_STATIS','APP_SUB_GROUP_DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','ID','id');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','BASE_GROUP_NODE_TYPE_COUNT','基础图谱实体种类的个数');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','BASE_GROUP_EDGE_TYPE_COUNT','基础图谱关系种类的个数');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','COMMON_GROUP_COUNT','通用图谱的个数');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','APP_SUB_GROUP_COUNT','应用子图的个数');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','BASE_GROUP_DATA_AMOUNT','基础图谱的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','COMMON_GROUP_DATA_AMOUNT','通用图谱的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','APP_SUB_GROUP_DATA_AMOUNT','应用子图的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_DAY_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('SUMMARY_DAY_STATIS','图谱概要数据日统计');
END;
/
-- 图谱概要数据月统计
-- drop table SUMMARY_MONTH_STATIS;
BEGIN
  proc_create_table('SUMMARY_MONTH_STATIS',
'CREATE TABLE "SUMMARY_MONTH_STATIS" (
"ID" NUMBER(11) NOT NULL,
"BASE_GROUP_NODE_TYPE_COUNT" NUMBER(11),
"BASE_GROUP_EDGE_TYPE_COUNT" NUMBER(11),
"COMMON_GROUP_COUNT" NUMBER(11),
"APP_SUB_GROUP_COUNT" NUMBER(11),
"BASE_GROUP_DATA_AMOUNT" NUMBER(11),
"COMMON_GROUP_DATA_AMOUNT" NUMBER(11),
"APP_SUB_GROUP_DATA_AMOUNT" NUMBER(11),
"STATIS_DT" DATE
)');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','BASE_GROUP_NODE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','BASE_GROUP_EDGE_TYPE_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','COMMON_GROUP_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','APP_SUB_GROUP_COUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','COMMON_GROUP_DATA_AMOUNT','default 0');
proc_column_update ('modColumnProperty','SUMMARY_MONTH_STATIS','APP_SUB_GROUP_DATA_AMOUNT','default 0');

proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','ID','id');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','BASE_GROUP_NODE_TYPE_COUNT','基础图谱实体种类的个数');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','BASE_GROUP_EDGE_TYPE_COUNT','基础图谱关系种类的个数');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','COMMON_GROUP_COUNT','通用图谱的个数');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','APP_SUB_GROUP_COUNT','应用子图的个数');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','BASE_GROUP_DATA_AMOUNT','基础图谱的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','COMMON_GROUP_DATA_AMOUNT','通用图谱的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','APP_SUB_GROUP_DATA_AMOUNT','应用子图的数据量（数据条数）');
proc_column_update ('modColumnComment','SUMMARY_MONTH_STATIS','STATIS_DT','记录创建时间统计时间');
proc_comment_table('SUMMARY_MONTH_STATIS','图谱概要数据月统计');
END;
/


-- ==================
-- 初始化数据部分
-- ==================

-------------------------------② 初始化系统内置用户和角色数据---------------------------------------------------
DELETE FROM sys_role WHERE id < 0;
INSERT INTO sys_role (id, name, code, created_by, updated_by, role_source)VALUES(-1,'系统管理员','sysManager','1','1', 'GRAPHARY');
INSERT INTO sys_role (id, name, code, created_by, updated_by, role_source)VALUES(-2,'图仓管理员','graphManager','1','1', 'GRAPHARY');
INSERT INTO sys_role (id, name, code, created_by, updated_by, role_source)VALUES(-3,'应用开发人员','developer','1','1', 'GRAPHARY');

DELETE FROM sys_user WHERE id < 0;
INSERT INTO sys_user (id, user_no, password, name,user_source, phone, email, created_by, updated_by)VALUES(-2,'superadmin','SHA-1$1000$RBG0FMwC$282589594fb284e5eb18c863ea0f71b6c689db79','系统管理员','SYS_CREATION','','','0','0');

-- ID为-1的sys_user在图平台有特殊含义，参考：com.graph.atlas.sys.auth.filter.AuthTypeFilter.checkLogin

DELETE FROM sys_user_role WHERE id < 0;
INSERT INTO sys_user_role (id, user_id, role_id, source_type)VALUES(-1,-2,-1,'SYS_ROLE');
INSERT INTO sys_user_role (id, user_id, role_id, source_type)VALUES(-2,-2,-2,'SYS_ROLE');
INSERT INTO sys_user_role (id, user_id, role_id, source_type)VALUES(-3,-2,-3,'SYS_ROLE');

-- 内置组织：图仓团队，并给组织分配图仓管理员角色
DELETE FROM sys_org WHERE id < 0;
INSERT INTO sys_org (id, name, org_code, org_level, parent_ids)VALUES(-2,'默认组织',NULL,0,'[0]');
INSERT INTO sys_org (id, name, org_code, org_level, parent_ids)VALUES(-1,'图仓团队','TCTD',1,'[-2]');

DELETE FROM sys_org_role where id < 0;
INSERT INTO sys_org_role(id,sys_role_id,sys_org_id) VALUES(-1,-2,-1);

DELETE FROM sub_graph_space where id < 0;
INSERT INTO sub_graph_space(id,org_id,name) VALUES(-1,-1,'图仓团队空间');

-- 初始化内置图谱
DELETE FROM GRAPH where ID < 0;
INSERT INTO GRAPH(ID,"TYPE","NAME","NAME_CN") VALUES(-1,'BASE','base_graph','基础图谱');

DELETE FROM sys_resource;
-- 初始首页权限列表
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('首页','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '7', 'admin_index','admin_index', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('搜索','admin_index', 'SYSTEM_MANAGE', 'SYS', '', '7', 'admin_index_search','admin_index_search', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('图谱概览','admin_index', 'SYSTEM_MANAGE', 'SYS', '', '7', 'graph_overview','graph_overview', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('数据概览','admin_index', 'SYSTEM_MANAGE', 'SYS', '', '7', 'data_overview','data_overview', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

-- 子图空间

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('子图空间','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '7', 'sub_graph_space','sub_graph_space', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('子图注册','sub_graph_space', 'SYSTEM_MANAGE', 'SYS', '', '1', 'sub_graph_apply','sub_graph_apply', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('子图审批','sub_graph_space', 'SYSTEM_MANAGE', 'SYS', '', '6', 'SUB_GRAPH_APPLY','SUB_GRAPH_APPLY', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('子图管理','sub_graph_space', 'SYSTEM_MANAGE', 'SYS', '', '6', 'sub_graph_manage','sub_graph_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

-- 本体模型
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('本体模型','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '7', 'domain_model','domain_model', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('本体申请','domain_model', 'SYSTEM_MANAGE', 'SYS', '', '1', 'domain_apply','domain_apply', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('本体审批','domain_model', 'SYSTEM_MANAGE', 'SYS', '', '6', 'domain_approve','domain_approve', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('本体模型','domain_model', 'SYSTEM_MANAGE', 'SYS', '', '6', 'domain_model_manage','domain_model_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

-- 数据目录
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('数据目录','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '7', 'data_catalog','data_catalog', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('基础图谱','data_catalog', 'SYSTEM_MANAGE', 'SYS', '', '1', 'basic_graph','basic_graph', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('通用图谱','data_catalog', 'SYSTEM_MANAGE', 'SYS', '', '1', 'common_graph','common_graph', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('应用子图','data_catalog', 'SYSTEM_MANAGE', 'SYS', '', '1', 'app_sub_graph','app_sub_graph', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');


-- 数据申请
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('数据申请','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', 'DG', 'data_apply_group','data_apply_group', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('数据申请','data_apply_group', 'SYSTEM_MANAGE', 'SYS', '', '1', 'data_apply','data_apply', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('数据审批','data_apply_group', 'SYSTEM_MANAGE', 'SYS', '', '6', 'data_approve','data_approve', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('授权管理','data_apply_group', 'SYSTEM_MANAGE', 'SYS', '', '6', 'auth_manage','auth_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');


-- 系统管理
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('系统管理','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '4', 'sys_manage','sys_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('用户管理','sys_manage', 'SYSTEM_MANAGE', 'SYS', '', '4', 'user_manage','user_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('组织管理','sys_manage', 'SYSTEM_MANAGE', 'SYS', '', '4', 'org_manage','org_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('日志管理','sys_manage', 'SYSTEM_MANAGE', 'SYS', '', '4', 'log_manage','log_manage', '', 'CUSTOMIZABLE','','Y', 'RESOURCE', null, '', '', '{}', 'GRAPHARY');

-- 登录\登出
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('登录','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '4', 'auth_login','api_auth_login', '/api/auth/login','CUSTOMIZABLE', '', 'Y', 'LOG_Y', '{"displayName":"%s登录","variableName":"userNo"}', '其他', '其他', '{}', 'GRAPHARY');
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('登出','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '4', 'auth_logout','api_auth_logout', '/api/auth/logout','CUSTOMIZABLE', '', 'Y', 'LOG_Y', '{"displayName":"%s登出","variableName":"userNo"}', '其他', '其他', '{}', 'GRAPHARY');
INSERT INTO sys_resource(name, parent_resource_code, root_menu, type, sub_type, group_type, code, resource_code, url, roles_limit, remark, enabled_flag, node_type_enable_log, operation_item_template, function_module, ui_category, operation_detail_template, resource_source)VALUES
('选择角色','parent_resource_code', 'SYSTEM_MANAGE', 'SYS', '', '4', 'user_saveRoleAndProject','gap_api_user_saveRoleAndProject', '/gap/api/user/saveRoleAndProject','CUSTOMIZABLE', '', 'Y', 'LOG_Y', '{"displayName":"选择<%s(%s)>角色", "variableName":"projectName,roleName"}', '其他', '其他', '{}', 'GRAPHARY');




DELETE FROM sys_config WHERE TYPE = 'ATLAS';
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DB', 'VERSION', '1.0.0','数据库结构版本');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'LOGO', '', '平台LOGO');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'NAME', '图仓平台', '平台展示名称');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'BROWSER_LOGO', '', '浏览器LOGO');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'mix', '深邃', 'THEME');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'BROWSER_NAME', '图仓平台', '展示平台名称');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'WATER_MARK_SWITCH', 'false', '水印开关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'DISPLAY', 'WATER_MARK_CONFIG', null, '水印配置');

INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/swagger-ui.html', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/swagger-ui.html#/**', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/swagger-resources/**', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/v2/api-docs', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/webjars/springfox-swagger-ui/**', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/swagger2/**', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/error/**', 'anon', 'shiro路由白名单-swagger相关');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/enableLogAudit', 'anon', 'shiro路由白名单-启动审计日志');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/disableLogAudit', 'anon', 'shiro路由白名单-关闭审计日志');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/auth/login', 'anon', 'shiro路由白名单-登录');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/auth/loginout', 'anon', 'shiro路由白名单-登出');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/auth/isLogin', 'anon', 'shiro路由白名单-判断是否登录');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/health/**', 'anon', 'shiro路由白名单-健康检查');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/cache/**', 'anon', 'shiro路由白名单-缓存管理');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/devops/**', 'anon', 'shiro路由白名单-运维管理');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/*.html', 'anon', 'shiro路由白名单-静态资源html');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/*.js', 'anon', 'shiro路由白名单-静态资源js');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/*.ico', 'anon', 'shiro路由白名单-静态资源ico');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/**/*.css', 'anon', 'shiro路由白名单-静态资源css');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/actuator/**', 'anon', 'shiro路由白名单-actuator相关restapi');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/auth/findSysLoginUserById', 'anon', 'shiro路由白名单-根据用户Id获取系统角色信息');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/auth/pkiLogin','anon', 'shiro路由白名单-pki登录');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/ops/prometheus','anon', 'shiro路由白名单-prometheus');
INSERT INTO sys_config (type, sub_type, config_key, config_value, remark)VALUES('ATLAS', 'SHIRO_WHITE_LIST', '/ops/encrypt','anon', 'shiro路由白名单-nacos配置项加密');


DELETE FROM database_keyword;

-- ==修复数据统计
-- 图谱
UPDATE GRAPH SET NODE_TYPE_COUNT=0 WHERE NODE_TYPE_COUNT IS NULL;
UPDATE GRAPH SET NODE_AMOUNT=0 WHERE NODE_AMOUNT IS NULL;
UPDATE GRAPH SET EDGE_TYPE_COUNT=0 WHERE EDGE_TYPE_COUNT IS NULL;
UPDATE GRAPH SET EDGE_AMOUNT=0 WHERE EDGE_AMOUNT IS NULL;
UPDATE GRAPH SET EDGE_AND_NODE_TYPE_TOTAL=0 WHERE EDGE_AND_NODE_TYPE_TOTAL IS NULL;
UPDATE GRAPH SET EDGE_AND_NODE_TOTAL=0 WHERE EDGE_AND_NODE_TOTAL IS NULL;

-- 图谱表
UPDATE GRAPH_TABLE SET FIELD_NUM=0 WHERE FIELD_NUM IS NULL;
UPDATE GRAPH_TABLE SET AMOUNT=0 WHERE AMOUNT IS NULL;
UPDATE GRAPH_TABLE SET COMMON_GRAPH_COUNT=0 WHERE COMMON_GRAPH_COUNT IS NULL;
UPDATE GRAPH_TABLE SET APP_SUB_GRAPH_COUNT=0 WHERE APP_SUB_GRAPH_COUNT IS NULL;
-- 表日报
UPDATE TABLE_DAY_STATIS SET DATA_AMOUNT=0 WHERE DATA_AMOUNT IS NULL;
UPDATE TABLE_MONTH_STATIS SET DATA_AMOUNT=0 WHERE DATA_AMOUNT IS NULL;
UPDATE GRAPH_DAY_STATIS SET DATA_AMOUNT=0 WHERE DATA_AMOUNT IS NULL;
UPDATE GRAPH_MONTH_STATIS SET DATA_AMOUNT=0 WHERE DATA_AMOUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET BASE_GROUP_NODE_TYPE_COUNT=0 WHERE BASE_GROUP_NODE_TYPE_COUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET BASE_GROUP_EDGE_TYPE_COUNT=0 WHERE BASE_GROUP_EDGE_TYPE_COUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET COMMON_GROUP_COUNT=0 WHERE COMMON_GROUP_COUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET APP_SUB_GROUP_COUNT=0 WHERE APP_SUB_GROUP_COUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET COMMON_GROUP_DATA_AMOUNT=0 WHERE COMMON_GROUP_DATA_AMOUNT IS NULL;
UPDATE SUMMARY_DAY_STATIS SET APP_SUB_GROUP_DATA_AMOUNT=0 WHERE APP_SUB_GROUP_DATA_AMOUNT IS NULL;

UPDATE SUMMARY_MONTH_STATIS SET BASE_GROUP_NODE_TYPE_COUNT=0 WHERE BASE_GROUP_NODE_TYPE_COUNT IS NULL;
UPDATE SUMMARY_MONTH_STATIS SET BASE_GROUP_EDGE_TYPE_COUNT=0 WHERE BASE_GROUP_EDGE_TYPE_COUNT IS NULL;
UPDATE SUMMARY_MONTH_STATIS SET COMMON_GROUP_COUNT=0 WHERE COMMON_GROUP_COUNT IS NULL;
UPDATE SUMMARY_MONTH_STATIS SET APP_SUB_GROUP_COUNT=0 WHERE APP_SUB_GROUP_COUNT IS NULL;
UPDATE SUMMARY_MONTH_STATIS SET COMMON_GROUP_DATA_AMOUNT=0 WHERE COMMON_GROUP_DATA_AMOUNT IS NULL;
UPDATE SUMMARY_MONTH_STATIS SET APP_SUB_GROUP_DATA_AMOUNT=0 WHERE APP_SUB_GROUP_DATA_AMOUNT IS NULL;


-- ==================
-- 升级脚本固定结束部分(结束部分请勿再插入其它业务更新语句);
-- ==================

DECLARE
  column_count INT;
BEGIN
SELECT count(*) INTO column_count FROM user_sequences
WHERE sequence_name = 'HIBERNATE_SEQUENCE';
IF column_count = 0 THEN
        -- DROP SEQUENCE HIBERNATE_SEQUENCE;
        execute immediate 'CREATE OR REPLACE SEQUENCE HIBERNATE_SEQUENCE
        MINVALUE 1
        MAXVALUE 999999999999999999999999999
        START WITH 100000
        INCREMENT BY 1
        CACHE 100';
END IF;
END;
/

COMMIT;