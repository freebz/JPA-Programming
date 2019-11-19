// 예제 12.13 JPA 네이티브 SQL 지원

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query(value = "SELECT * FROM MEMBER WHERE USERNAME = ?0",
        nativeQuery = true)
    Member findByUsername(String username);
}
