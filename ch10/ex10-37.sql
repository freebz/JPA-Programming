-- 예제 10.37 JPQL

select o.member.team
from Order o
where o.product.name = 'productA' and o.address.city = 'JINJU'
