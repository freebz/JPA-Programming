// 예제 10.64 튜플

//JPQL: select m.username, m.age from Member m

CriteriaBuilder cb = em.getCriteriaBuilder();

CriteriaQuery<Tuple> cq = cb.createTupleQuery();
//CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class); //위와 같다.

Root<Member> m = cq.from(Member.class);
cq.multiselect(
        m.get("username").alias("username"), //튜플에서 사용할 튜플 별칭
	m.get("age").alias("age")
);

TypedQuery<Tuple> query = em.createQuery(cq);
List<Tuple> resultList = query.getResultList();
for (Tuple tutpe : resultList) {
    //튜플 별칭으로 조회
    String username = tuple.get("username", String.class);

    Integer age = tuple.get("age", Integer.class);
}
