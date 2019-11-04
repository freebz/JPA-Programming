-- 예제 7.23 자동 생성된 DDL

create table Member (
    MEMBER_ID bigint not null,
    createdDate timestamp,
    lastModifiedDate timestamp,
    city varchar(255),
    name varchar(255),
    street varchar(255),
    zipcode varchar(255),
    primary key (MEMBER_ID)
)
