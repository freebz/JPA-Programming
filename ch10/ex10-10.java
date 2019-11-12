// 예제 10.10 이름 기준 파라미터 사용

String usernameParam = "User1";

TypedQuery<Member> query =
    em.createQuery("SELECT m FROM Member m where m.username = :username", Member.class);

query.setParameter("username", usernameParam);
List<Member> resultList = query.getResultList();
