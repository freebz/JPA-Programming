-- 예제 14.25 실행된 SQL

select o.*, m.*, oi.*, i.*
from
    ORDERS o
left outer join
    Member m
        on o.MEMBER_ID=m.MEMBER_ID
left outer join
    ORDER_ITEM oi
        on o.ORDER_ID=oi.ORDER_ID
left outer join
    Item i
        on oi.ITEM_ID=i.ITEM_ID
where
    o.ORDER_ID=?
