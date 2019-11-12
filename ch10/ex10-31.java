// 예제 10.31 컬렉션 페치 조인 사용

String jpql = "select t from Team t join fetch t.members where t.name = '팀A'";
List<Team> teams = em.createQuery(jpql, Team.class).getResultList();

for (Team team : teams) {

    System.out.println("teamname = " + team.getName() + ", team = " + team);

    for (Member member : team.getMembers()) {

	//페치 조인으로 팀과 회원을 함께 조회해서 지연 로딩 발생 안함
	System.out.println(
	    "->username = " + member.getUsername()+ ", member = " + member);
    }
}
