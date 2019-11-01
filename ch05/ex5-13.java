// 예제 5.13 양방향 연관관계 저장

public void testSave() {

    //팀1 저장
    Team team1 = new Team("team1", "팀1");
    em.persist(team1);

    //회원1 저장
    Member member1 = new Member("member1", "회원1");
    member1.setTeam(team1); //연관관계 설정 member1 -> team1
    em.persist(member1);

    //회원2 저장
    Member member2 = new Member("membe2", "회원2");
    member2.setTeam(team1); //연관관계 설정 member2 -> team1
    em.persist(member2);
}
