// 예제 10.46 외래 키 대신에 엔티티를 직접 사용하는 코드

Team team = em.find(Team.class, 1L);

String qlString = "select m from Member m where m.team = :team";
List resultList = em.createQuery(qlString)
    .setParameter("team", team)
    .getResultList();
