// 예제 10.70 IN 식 사용 예

/* JPQL
    select m from Member m
    where m.username in ("회원1", "회원2")
*/

CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Member> cq = cb.createQuery(Member.class);
Root<Member> m = cq.from(Member.class);

cq.select(m)
    .where(cb.in(m.get("username"))
	   .value("회원1")
	   .value("회원2"));
