// 예제 10.24 내부 조인 사용 예

String teamName = "팀A";
String query = "SELECT m FROM Member m INNER JOIN m.team t "
               + "WHERE t.name = :teamName";

List<Member> members = em.createQuery(query, Member.class)
    .setParameter("teamName", teamName)
    .getResultList();
