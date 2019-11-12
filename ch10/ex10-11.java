// 예제 10.11 위치 기준 파라미터 사용

List<Member> members =
    em.createQuery("SELECT m FROM Member m where m.username = ?1", Member.class)
        .setParameter(1, usernameParam)
        .getResultList();
