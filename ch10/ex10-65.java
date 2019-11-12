// 예제 10.65 튜플과 엔티티 조회

CriteriaQuery<Tuple> cq = cb.createTupleQuery();
Root<Member> m = cq.from(Member.class);
cq.select(cb.tuple(
    m.alias("m"), //회원엔티티, 별칭 m
    m.get("username").alias("username") //단순 값 조회, 별칭 username
));

TypedQuery<Tuple> query = em.creteQuery(cq);
List<Tuple> resultList = query.getResultList();
for (Tuple tuple : resultList) {
    Member member = tuple.get("m", Member.class);
    String username = tuple.get("username", String.class);
}
