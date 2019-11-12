// 예제 10.60 튜플로 조회

CriteriaBuilder cb = em.getCriteriaBuilder();

//조회값 반환 타입: Tuple
CriteriaQuery<Tuple> cq = cb.createTupleQuery();
...
TypedQuery<Tuple> query = em.createQuery(cq);
