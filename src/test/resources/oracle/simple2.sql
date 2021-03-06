create table "EDGE_RELATION" (
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
);