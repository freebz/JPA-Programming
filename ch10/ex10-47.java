// 예제 10.46 외래 키에 식별자를 직접 사용하는 코드

String qlString = "select m from Member m where m.team.id = :teamId";
List resultList = em.createQuery(qlString)
    .setParameter("teamId", 1L)
    .getResultList();
