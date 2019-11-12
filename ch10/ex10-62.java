// 예제 10.62 완성된 코드

//JPQL: select distinct m.username, m.age from Member m

CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
Root<Member> m = cq.from(Member.class);
cq.multiselect(m.get("username"), m.get("age")).distinct(true);
//sq.select(cb.array(m.get("username"), m.get("age"))).distinct(true); //위 코드와 같다.

TypedQuery<Object[]> query = em.createQuery(cq);
List<Object[]> resultList = query.getResultList();
