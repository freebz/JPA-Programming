// 예제 10.68 간단한 서브 쿼리

/* JPQL:
    select m from Member m
    where m.age >=
        (select AVG(m2.age) from Member m2)
*/

CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Member> mainQuery = cb.createQuery(Member.class);

//서브 쿼리 생성
Subquery<Double> subQuery = mainQuery.subquery(Double.class);
Root<Member> m2 = subQuery.from(Member.class);
subQuery.select(cb.avg(m2.<Integer>get("age")));

//메인 쿼리 생성
Root<Member> m = mainQuery.from(Member.class);
mainQuery.select(m)
  .where(cb.ge(m.<Integer>get("age"), subQuery));
