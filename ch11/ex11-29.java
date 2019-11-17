// 예제 11.29 중복 회원 예외처리 테스트 코드

@Test(expected = IllegalStateException.class)
public void 중복_회원_예외() throws Exception {

    //Given
    Member member1 = new Member();
    member1.setName("kim");

    Member member2 = new Member();
    member2.setName("kim");

    //When
    memberService.join(member1);
    memberService.join(member2); //예외가 발생해야 한다.

    //Then
    fail("에외가 발생해야 한다.");
}
