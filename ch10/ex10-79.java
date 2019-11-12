// 예제 10.79 QueryDSL 시작

public void queryDSL() {

    EntityManager em = emf.createEntityManager();

    JPAQuery query = new JPAQuery(em);
    QMember qMember = new QMember("m"); //생성되는 JPQL의 별칭이 m
    List<Member> members =
	query.from(qMember)
	    .where(qMember.name.eq("회원1"))
 	    .orderBy(qMember.name.desc())
	    .list(qMember);
}
