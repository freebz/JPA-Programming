// 에쪠 10.115 네이티브 SQL과 페이징 처리

String sql = "SELECT ID, AGE, NAME, TEAM_ID FROM MEMBER";
Query nativeQuery = em.createNativeQuery(sql, Member.class)
    .setFirstResult(10)
    .setMaxResults(20)
