-- 예제 10.32 내부 조인 JPQL

select t
from Team t join t.members m
where t.name = '팀A'
