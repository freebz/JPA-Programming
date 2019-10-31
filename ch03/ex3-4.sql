-- 예제 3.4 수정된 데이터만 반영할 것으로 예상

UPDATE MEMBER
SET
    NAME=?,
    AGE=?
WHERE
    id=?
