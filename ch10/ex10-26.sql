-- 예제 10.26 회원 이름이 팀 이름과 똑같은 사람 수를 구하는 예

//JPQL
select count(m) from Member m, Team t
where m.username = t.name

//SQL
SELECT COUNT(M.ID)
FROM
    MEMBER M CROSS JOIN TEAM T
WHERE
    M.USERNAME=T.NAME
