// 예제 5.8 연관관계를 수정하는 코드

private static void updateRelation(EntityManager em) {

    //새로운 팀2
    Team team2 = new Team("team2", "팀2");
    em.persist(team2);

    //회원1에 새로운 팀2 설정
    Member member = em.find(Member.class, "member1");
    member.setTeam(team2);
}
