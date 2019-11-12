-- 예제 10.40 빈 컬렉션 비교 예제

//JPQL: 주문이 하나라도 있는 회원 조회
select m from Member m
where m.orders is not empty

//실행된 SQL
select m.* from Member m
where
    exists (
        select o.id
	from Orders o
	where m.id=o.member_id
    )
