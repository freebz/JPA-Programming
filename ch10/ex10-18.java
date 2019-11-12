// 예제 10.18 페이징 사용

TypedQuery<Member> query =
    em.createQuery("SELECT m FROM Member m ORDER BY m.username DESC", Member.class);

query.setFirstResult(10);
query.setMaxResults(20);
query.getResultList();
