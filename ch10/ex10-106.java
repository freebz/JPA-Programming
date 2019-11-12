// 예제 10.106 엔티티 조회 코드

//SQL 정의
String sql =
    "SELECT ID, AGE, NAME, TEAM_ID " +
    "FROM MEMBER WHERE AGE > ?";

Query nativeQuery = em.createNativeQuery(sql, Member.class)
    .setParameter(1, 20);

List<Member> resultList = nativeQuery.getResultList();
