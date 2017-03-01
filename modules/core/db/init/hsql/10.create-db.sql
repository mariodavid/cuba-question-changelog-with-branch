-- begin CQCWB_CUSTOMER
create table CQCWB_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(4000) not null,
    --
    primary key (ID)
)^
-- end CQCWB_CUSTOMER
