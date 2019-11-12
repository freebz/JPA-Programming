// 예제 10.28 페치 조인 사용

String jpql = "select m from Member m join fetch m.team";

List<Member> members = em.createQuery(jpql, Member.class)
    .getResultList();

for (Member member : members) {
    //페치 조인으로 회원과 팀을 함께 조회해서 지연 로딩 발생 안 함
    System.out.println("username = " + member.getUsername() + ", " +
        "teamname = " + member.getTeam().name());
}
