
-- 表：表关系起点与终点
begin
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
end;
/
COMMENT ON COLUMN "EDGE_RELATION"."KEY" IS '关联表唯一标识';
COMMENT ON COLUMN "EDGE_RELATION"."EDGE_ID" IS '关系表ID';
COMMENT ON COLUMN "EDGE_RELATION"."START_NODE_ID" IS '起点实体表ID';
COMMENT ON COLUMN "EDGE_RELATION"."START_NODE_NAME" IS '起点实体表英文名称';
COMMENT ON COLUMN "EDGE_RELATION"."START_NODE_NAMECN" IS '起点实体表中文名称';
COMMENT ON COLUMN "EDGE_RELATION"."END_NODE_NAME" IS '结束实体表英文名称';
COMMENT ON COLUMN "EDGE_RELATION"."END_NODE_NAMECN" IS '结束实体表中文名称';
COMMENT ON COLUMN "EDGE_RELATION"."CREATED_DT" IS '创建时间';
COMMENT ON COLUMN "EDGE_RELATION"."TABLE_KEY" IS '关联表key';
COMMENT ON TABLE "EDGE_RELATION" IS '关系起点与终点';
/