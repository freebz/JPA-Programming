// 예제 10.49 @NamedQuery 사용

List<Member> resultList = em.createNamedQuery("Member.findByUsername",
    Member.class)
            .setParameter("username", "회원1")
            .getResultList();
