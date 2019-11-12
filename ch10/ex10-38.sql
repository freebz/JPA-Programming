-- 예제 10.38 실행된 SQl

select t.*
from Orders o
inner join Member m on o.member_id=m.id
inner join Team t on m.team=t.id
inner join Product p on o.product_id=p.id
where p.name='productA' and o.city='JINJU'
