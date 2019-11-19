// 예제 12.27 사용자 정의 인터페이스 상속

public interface memberRepository
    extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}
