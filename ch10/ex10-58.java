// 예제 10.58 Object로 조회

CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Object> cq = cb.createQuery(); //조회값 반환 타입: Object
...
List<Object> resultList = em.createQuery(cq).getResultList();
