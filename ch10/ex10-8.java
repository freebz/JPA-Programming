// 예제 10.8 TypeQuery 사용

TypedQuery<Member> query =
    em.createQuery("SELECT m FROM Member m", Member.class);

List<Member> resultList = query.getResultList();
for (Member member : resultList) {
    System.out.println("member = " + member);
}
