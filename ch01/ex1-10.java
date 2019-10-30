// 예제 1.10 개발자가 직접 연관관계를 설정

public Member find(String memberId) {

    //SQL 실행
    ...
    Member member = new Member();
    ...

    //데이터베이스에서 조회한 회원 관련 정보를 모두 입력
    Team team = new Team();
    ...
    //회원과 팀 관계 설정
    member.setTeam(team);
    return member;
}
