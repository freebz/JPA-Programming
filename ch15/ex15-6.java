// 예제 15.6 원본 먼저 조회하고 나서 프록시로 조회하기 예제 코드

@Test
public void 영속성컨텍스트와_프록시2() {

    Member newMember = new Member("member1", "회원1");
    em.persist(newMember);
    em.flush();
    em.clear();

    Member findMember = em.find(Member.class, "member1");
    Member refMember = em.getReference(Member.class, "member1");

    System.out.println("refMember Type = " + refMember.getClass());
    System.out.println("findMember Type = " + findMember.getClass());

    Assert.assertTrue(refMember == findMember);
}
