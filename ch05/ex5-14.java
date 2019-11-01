// 예제 5.14 양방향 연관관계 주의점

public void testSaveNonOwner() {

    //회원1 저장
    Member member1 = new Member("member1", "회원1");
    em.persist(member1);

    //회원2 저장
    Member member2 = new Member("member2", "회원2");
    em.persist(member2);

    Team team1 = new Team("team1", "팀1");
    //주인이 아닌 곳만 연관관계 설정
    team1.getMembers().add(member1);
    team1.getMembers().add(member2);

    em.persist(team1);
}
