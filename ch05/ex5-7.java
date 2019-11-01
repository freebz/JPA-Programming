// 예제 5.7 JPQL 조인 검색

private static void queryLogicJoin(EntityManager em) {

    String jpql = "select m from Member m join m.team t where " +
	"t.name=:teamName";

    List<Member> resultList = em.createQuery(jpql, Member.class)
	.setParameter("teamName", "팀1")
	.getResultList();

    for (Member member : resultList) {
	System.out.println("[query] member.username=" +
			   member.getUsername());
    }
}
//결과: [query] member.username=회원1
//결과: [query] member.username=회원2
