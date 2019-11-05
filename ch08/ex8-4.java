// 예제 8.4 회원 정보만 출력하는 비즈니스 로직

public String printUser(String memberId) {
    Member member = em.find(Member.class, memberId);
    System.out.println("회원 이름: " + member.getUsername());
}
