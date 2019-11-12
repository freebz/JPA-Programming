// 예제 10.73 JPQL 동적 쿼리

//검색 조건
Integer age = 10;
String username = null;
String teamName = "팀A";

//JPQL 동적 쿼리 생성
StringBuilder jpql = new StringBuilder("select m from Member m join m.team t ");
List<String> criteria = new ArrayList<String>();

if (age != null) criteria.add(" m.age = :age ");
if (username != null) criteria.add(" m.username = :username ");
if (teamName != null) criteria.add(" t.name = :teamName ");

if (criteria.size() > 0) jpql.append(" where ");

for (int i = 0; i < criteria.size(); i++) {
    if (i > 0) jpql.append(" and ");
    jpql.append(criteria.get(i));
}

TypedQuery<Member> query = em.createQuery(jpql.toString(),
    Member.class);
if (age != null) query.setParameter("age", age);
if (username != null) query.setParameter("username", username);
if (teamName != null) query.setParameter("teamName", teamName);

List<Member> resultList = query.getResultList();
