-- 예제 3.5 실제는 엔티티의 모든 필드를 수정에 반영

UPDATE MEMBER
SET
    NAME=?,
    AGE=?,
    GRADE=?,
    ...
WHERE
    id=?
