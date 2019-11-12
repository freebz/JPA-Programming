// 예제 10.45 식별자 값을 직접 사용하는 코드

String slString = "select m from Member m where m.id = :memberId";
List resultList = em.createQuery(qlString)
    .setParameter("memberId", 4L)
    .getResultList();
