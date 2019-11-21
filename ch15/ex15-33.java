// 예제 15.33 SQL 쿼리 힌트 사용

Session session = em.unwrap(Session.class); //하이버네이트 직접 사용

List<Member> list = session.createQuery("select m from Member m")
      .addQueryHint("FULL (MEMBER)") //SQL HINT 추가
      .list();
