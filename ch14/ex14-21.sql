-- 예제 14.21 실행된 SQL

select o.*, m.*
from
    ORDERS o
inner join
    Member m
        on o.MEMBER_ID=m.MEMBER_ID
where
    o.ORDER_ID=?
