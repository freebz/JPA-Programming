// 예제 10.2 JPQL 사용

//쿼리 생성
String jpql = "select m from Member as m where m.username = 'kim'";
List<Member> resultList =
    em.createQuery(jpql, Member.class).getResultList();
