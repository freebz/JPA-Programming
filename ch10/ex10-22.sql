-- 예제 10.22 오라클(org.hibernate.dialect.Oracle10gDialect)

SELECT *
FROM
    ( SELECT ROW_.*, ROWNUM ROWNUM_
    FROM
        ( SELECT
	    M.ID AS ID,
	    M.AGE AS AGE,
	    M.TEAM_ID AS TEAM_ID,
	    M.NAME AS NAME
	FROM MEMBER M
	ORDER BY M.NAME
	) ROW_
    WHERE ROWNUM <= ?
    )
WHERE ROWNUM_ > ?
