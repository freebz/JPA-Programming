// 예제 10.82 import static 활용

import static jpabook.jpashop.domain.QMember.member; //기본 인스턴스

public void basic() {

    EntityManager em = emf.createEntityManager();

    JPAQuery query = new JPAQuery(em);
    List<Member> members =
	query.from(member)
  	    .where(member.name.eq("회원!"))
	    .orderBy(member.name.desc())
	    .list(member);
}
