// 예제 12.14 파라미터 바인딩

import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select m from Member m where m.username = :name")
    Member findByUsername(@Param("name") String username);
}
