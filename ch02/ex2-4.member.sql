-- 예제 2.4 회원 테이블

CREATE TABLE MEMBER (
    ID VARCHAR(255) NOT NULL,	--아이디(기본 키)
    NAME VARCHAR(255),		--이름
    AGE INTEGER,		--나이
    PRIMARY KEY (ID)
)
