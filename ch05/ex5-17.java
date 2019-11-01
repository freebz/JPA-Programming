// 예제 5.17 JPA로 코드 완성

public void testORM_양방향() {

    //팀1 저장
    Team team1 = new Team("team1", "팀1");
    em.persist(team1);
    
    Member member1 = new Member("member1", "회원1");

    //양방향 연관관계 설정
    member1.setTeam(team1);         //연관관계 설정 member1 -> team1
    team1.getMembers().add(member1);//연관관계 설정 team1 -> member1
    em.persist(member1);
    
    Member member2 = new Member("member2", "회원2");

    //양항향 연관관계 설정
    member2.setTeam(team1);         //연관관계 설정 member2 -> team1
    team1.getMembers().add(member2);//연관관계 설정 team1 -> member2
    em.persist(member2);
}
