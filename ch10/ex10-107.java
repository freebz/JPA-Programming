// 예제 10.107 값 조회

//SQL 정의
String sql =
    "SELECT ID, AGE, NAME, TEAM_ID " +
    "FROM MEMBER WHERE AGE > ?";

Query nativeQuery = em.createNativeQuery(sql)
    .setParameter(1, 10);

List<Object[]> resultList = nativeQuery.getResultList();
for (Object[] row : resultList) {
    System.out.println("id = " + row[0]);
    System.out.println("age = " + row[1]);
    System.out.println("name = " + row[2]);
    System.out.println("team_id = " + row[3]);
}
