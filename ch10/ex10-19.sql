-- 예제 10.19 HSQLDB(org.hibernate.dialect.HSQLDialect)

SELECT
    M.ID AS ID,
    M.AGE AS AGE,
    M.TEAM_ID AS TEAM_ID,
    M.NAME AS NAME
FROM
    MEMBER M
ORDER BY
    M.NAME DESC OFFSET ? LIMIT ?