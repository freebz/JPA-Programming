// 예제 10.59 Object[]로 조회

CriteriaBuilder cb = em.getCriteriaBuilder();

//조회값 반환 타입: Object[]
CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
...
List<Object[]> resultList = em.createQuery(cq).getResultList();
