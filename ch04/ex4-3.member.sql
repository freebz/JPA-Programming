-- 예제 4.3 오라클 데이터베이스 방언 결과

create table MEMBER (
    ID varchar2(255 char) not null,
    NAME varchar2(255 char),
    age number(10,0),
    roleType varchar2(255 char),
    createdDate timestamp,
    lastModifiedDate timestamp,
    descriptionclob,
    primary key (ID)
)
