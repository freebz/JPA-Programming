// 예제 10.66 집합 예

/*
    JPQL:
    select m.team.name, max(m.age), min(m.age)
    from Member m
    group by m.team.name
 */

CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Object[]> cq = cb.creteQuery(Object[].class);
Root<Member> m = cq.from(Member.class);

Expression maxAge = cb.max(m.<Integer>get("age"));
Expression minAge = cb.min(m.<Integer>get("age"));

cq.multiselect(m.get("team").get("name"), maxAge, minAge);
cq.groupBy(m.get("team").get("name"));  //GROUP BY

TypedQuery<Object[]> query = em.creteQuery(cq);
List<Object[]> resultList = query.getResultList();
