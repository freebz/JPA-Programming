-- 예제 4.7 생성된 DDL

ALTER TABLE MEMBER
    ADD CONSTRAINT NAME_AGE_UNIQUE  UNIQUE (NAME, AGE)
