// 예제 12.11 스프링 데이터 JPA로 Named 쿼리 호출

public interface MemberRepository
    extends JpaRepository<Member, Long>   {//여기 선언한 Member 도메인 클래스

    List<Member> findByUsername(@Param("username") String username);
}
