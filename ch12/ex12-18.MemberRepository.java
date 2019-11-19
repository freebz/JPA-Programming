// 예제 12.18 Page 사용 예제 정의 코드

public interface MemberRepository extends Repository<Member, Long> {

    Page<Member> findByNameStartingWith(String name,
        Pageable Pageable);
}
