-- 예제 16.3 버전 사용 엔티티 SQL

UPDATE BOARD
SET
    TITLE=?,
    VERSION=?  (버전 + 1 증가)
WHERE
    ID=?
    AND VERSION=? (버전 비교)
