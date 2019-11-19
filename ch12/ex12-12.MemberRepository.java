// 예제 12.12 메소드에 JPQL 쿼리 작성

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select m from Member m where m.username = ?1")
    Member findByUsername(String username);
}
