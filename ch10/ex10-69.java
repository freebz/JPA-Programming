// 예제 10.69 상호 관련 서브 쿼리

/* JPQL
    select m from Member m
    where exists
        (select t from m.team t where t.name='팀A')
*/
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Member> mainQuery = cb.createQuery(Member.class);

//서브 쿼리에서 사용되는 메인 쿼리의 m
Root<Member> m = mainQuery.from(Member.class);

//서브 쿼리 생성
Subquery<Team> subQuery = mainQuery.subquery(Team.class);
Root<Member> subM = subQuery.correlate(m);  //메인 쿼리의 별칭을 가져옴
Join<Member, Team> t = subM.join("team");
subQuery.select(t)
  .where(cb.equal(t.get("name"), "팀A"));

//메인 쿼리 생성
mainQuery.select(m)
    .where(cb.exists(subQuery));

List<Member> resultList = em.createQuery(mainQuery).getResultList();
