// 예제 12.2 스프링 데이터 JPA 적용

public interface MemberRepository extends JpaRepository<Member, Long>{
    Member findByUsername(String username);
}

public interface ItemRepository extends JpaRepository<Item, Long> {
}
