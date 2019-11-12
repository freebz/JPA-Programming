-- 예제 10.84 실행된 JPQL

select item
from Item item
where item.name = ?1 and item.price > ?2
