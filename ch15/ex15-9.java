// 예제 15.9 프록시 동등성 비교, 실행

@Test
public void 프록시와_동등성비교() {
    Member saveMember = new Member("member1", "회원1");
    em.persist(saveMember);
    em.flush();
    em.clear();

    Member newMember = new Member("member1", "회원1");
    Member refMember = em.getReference(Member.class, "member1");

    Assert.assertTrue( newMember.equals(refMember) );
}
