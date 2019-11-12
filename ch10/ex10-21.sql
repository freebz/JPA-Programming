-- 예제 10.21 PostgreSQL(org.hibernate.dialect.PostgreSQL82Dialect)

SELECT
    M.ID AS ID,
    M.AGE AS AGE,
    M.TEAM_ID AS TEAM_ID,
    M.NAME AS NAME
FROM
    MEMBER M
ORDER BY
    M.NAME DESC LIMIT ? OFFSET ?
