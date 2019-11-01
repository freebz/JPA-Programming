// 예제 5.18 양방향 리팩토링 전체코드

public void testORM_양방향_리팩토링() {

    Team team1 = new Team("team1", "팀1");
    em.persist(team1);
    
    Member member1 = new Member("member1", "회원1");
    member1.setTeam(team1); //양향향 설정
    em.persist(member1);
    
    Member member2 = new Member("member2", "회원2");
    member2.setTeam(team1); //양방향 설정
    em.persist(member2);
}
