// 예제 3.8 detach() 테스트 코드

public void testDetached() {
    ...
    //회원 엔티티 생성, 비영속 상태
    Member member = new Member();
    member.setId("memberA");
    member.setUsername("회원A");

    //회원 에티티 영속 상태
    em.persist(member);

    //회원 엔티티를 영속성 컨텍스트에서 분리, 준영속 상태
    em.detach(member);

    transaction.commit(); //트랜잭션 커밋
}
