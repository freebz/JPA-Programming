// 예제 10.108 결과 매핑 사용

//SQL 정의
String sql =
    "SELECT M.ID, AGE, NAME, TEAM_ID, I.ORDER_COUNT " +
    "FROM MEMBER M " +
    "LEFT JOIN " +
    "    (SELECT IM.ID, COUNT(*) AS ORDER_COUNT " +
    "     FROM ORDERS O, MEMBER IM " +
    "     WHERE O.MEMBER_ID = IM.ID) I " +
    "ON M.ID = I.ID";

Query nativeQuery = em.createNativeQuery(sql, "memberWithOrderCount");

List<Object[]> resultList = nativeQuery.getResultList();
for (Object[] row : resultList) {
    Member member = (Member) row[0];
    BigInteger orderCount = (BigInteger)row[1];

    System.out.println("number = " + member);
    System.out.println("orderCount = " + orderCount);
}
