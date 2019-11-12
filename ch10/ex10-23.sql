-- 예제 10.23 SQLServer(org.hibernate.dialect.SQLServer2008Dialect)

WITH query AS (
    SELECT
    inner_query.*,
    ROW_NUMBER() OVER (ORDER BY CURRENT_TIMESTAMP) as
        __hibernate_row_nr__
    FROM
        ( select
	    TOP(?) m.id as id,
	    m.age as age,
	    m.team_id as team_id,
	    m.name as name
	from Member m
	order by m.name DESC
	) inner_query
)
SELECT id, age, team_id, name
FROM query
WHERE __hibernate_row_nr__ >= ? AND __hibernate_row_nr__ < ?
