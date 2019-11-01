// 예제 5.15 순수한 객체 연관관계

public void test순수한객체_양방향() {

    //팀1
    Team team1 = new Team("team1", "팀1");
    Member member1 = new Member("member1", "회원1");
    Member member2 = new Member("member2", "회원2");

    member1.setTeam(team1); //연관관계 설정 member1 -> team1
    member2.setTeam(team1); //연관관계 설정 member2 -> team1

    List<Member> members = team1.getMembers();
    System.out.println("members.size = " + members.size());
}
//결과: members.size = 0
