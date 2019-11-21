// 예제 15.7 프록시 타입 비교 예제 코드

@Test
public void 프록시_타입비교() {
    Member newMember = new Member("member1", "회원1");
    em.persist(newMember);
    em.flush();
    em.clear();

    Member refMember = em.getReference(Member.class, "member1");

    System.out.println("refMember Type = " + refMember.getClass());

    Assert.assertFalse(Member.class == refMember.getClass()); //false
    Assert.assertTrue(refMember instanceof Member);           //true
}
