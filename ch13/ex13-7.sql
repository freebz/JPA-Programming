-- 예제 13.7 페치 조인 사용 후

JPQL:
    select o
    from Order o
    join fetch o.member
    
SQL:
    select o.*, m.*
    from Order o
    join Member m on o.MEMBER_ID=m.MEMBER_ID
