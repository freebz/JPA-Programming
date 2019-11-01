-- 예제 4.14 TABLE 전략 키 생성 DDL

create table MY_SEQUENCES (
    sequence_name varchar(255) not null ,
    next_val bigint,
    primary key ( sequence_name )
)
