// 예제 10.67 JOIN 예

/* JPQL
    select m,t from Member m
    inner join m.team t
    where t.name = '팀A'
*/

Root<Member> m = cq.from(Member.class);
Join<Member, Team> t = m.join("team", JoinType.INNER);  //내부 조인

cq.multiselect(m, t)
  .where(cb.equal(t.get("name"), "팀A"));
