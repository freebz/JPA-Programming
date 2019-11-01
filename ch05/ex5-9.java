// 예제 5.9 연관관계를 삭제하는 코드

private static void deleteRelation(EntityManager em) {

    Member member1 = em.find(Member.class, "member1");
    member1.setTeam(null);  //연관관계 제거
}
