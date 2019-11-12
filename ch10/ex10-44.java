// 예제 10.44 엔티티를 파라미터로 직접 받는 코드

String slString = "select m from Member m where m = :member";
List resultList = em.createQuery(qlString)
    .setParameter("member", member)
    .getResultList();
