// 예제 10.74 Criteria 동적 쿼리

//검색 조건
Integer age = 10;
String username = null;
String teamName = "팀A";

//Criteria 동적 쿼리 생성
CriteriaBuilder cb = em.getCriteriaBuilder();
criteriaQuery<Member> cq = cb.createQuery(Member.class);

Root<Member> m = cq.from(Member.class);
Join<Member, Team> t = m.join("team");

List<Predicate> criteria = new ArrayList<Predicate>();

if (age != null) criteria.add(cb.equal(m.<Integer>get("age"),
    cb.parameter(Integer.class, "age")));
if (username != null) criteria.add(cb.equal(m.get("username"),
    cb.parameter(String.class, "username")));
if (teamName != null) criteria.add(cb.equal(t.get("name"),
    cb.parameter(String.class, "teamName")));

cq.where(cb.and(criteria.toArray(new Predicate[0])));

TypedQuery<Member> query = em.createQuery(cq);
if (age != null) query.setParameter("age", age);
if (username != null) query.setParameter("username", username);
if (teamName != null) query.setParameter("teamName", teamName);

List<Member> resultList = query.getResultList();
