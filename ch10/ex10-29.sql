-- 예제 10.29 컬렉션 페치 조인 JPQL

select t
from Team t join fetch t.members
where t.name = '팀A'
