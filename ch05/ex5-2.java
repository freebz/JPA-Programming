// 예제 5.2 동작 코드

public static void main(String[] args) {

    //생성자(id, 이름)
    Member member1 = new Member("member1","회원1");
    Member member2 = new Member("member2","회원2");
    Team team1 = new Team("team1","팀1");

    member1.setTeam(team1);
    member2.setTeam(team1);

    Team findTeam = member1.getTeam();
}
