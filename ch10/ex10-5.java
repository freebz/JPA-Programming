// 예제 10.5 네이티브 SQL

String sql = "SELECT ID, AGE, TEAM_ID, NAME FROM MEMBER WHERE NAME = 'kim'";
List<Member> resultList =
    em.createNativeQuery(sql, Member.class).getResultList();
