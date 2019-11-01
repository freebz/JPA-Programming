// 예제 5.12 일대다 방향으로 객체 그래프 탐색

public void biDirection() {

    Team team = em.find(Team.class, "team1");
    List<Member> members = team.getMembers(); //(팀 -> 회원)
                                              //객체 그래프 탐색

    for (Member member : members) {
	System.out.println("member.username = " +
	    member.getUsername());
    }
}
//===결과===
//member.username = 회원1
//member.username = 회원2
