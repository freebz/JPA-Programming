// 예제 10.57 반환 타입 지정

CriteriaBuilder cb = em.getCriteriaBuilder();

//Member를 반환 타입으로 지정
CriteriaQuery<Member> cq = cb.createQuery(Member.class);
...

//위에서 Member를 타입으로 지정했으므로 지정하지 않아도 Member 타입을 반환
List<Member> resultList = em.createQuery(cq).getResultList();
