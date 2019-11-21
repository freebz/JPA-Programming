// 예제 15.5 영속성 컨텍스트와 프록시 예제 코드

@Test
public void 영속성컨텍스트와_프록시() {

    Member newMember = new Member("member1", "회원1");
    em.persist(newMember);
    em.flush();
    em.clear();

    Member refMember = em.getReference(Member.class, "member1");
    Member findMember = em.find(Member.class, "member1");

    System.out.println("refMember Type = " + refMember.getClass());
    System.out.println("findMember Type = " + findMember.getClass());

    Assert.assertTrue(refMember == findMember);  //성공
}
