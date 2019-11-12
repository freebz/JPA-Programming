-- 예제 10.27 JOIN ON 사용 예

//JPQL
select m,t from Member m
left join m.team t on t.name = 'A'

//SQL
SELECT m.*, t.* FROM Member m
LEFT JOIN Team m ON m.TEAM_ID=t.id and t.name='A'
