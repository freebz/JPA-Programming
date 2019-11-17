// 예제 11.40 재고 수량 초과 테스트 코드

@Test(expected = NotEnoughStockException.class)
public void 상품주문_재고수량초과() throws Exception {

    //Given
    Member member = createMember();
    Item item = createBook("시골 JPA", 10000, 10); //이름, 가격, 재고
    int orderCount = 11; //재고보다 많은 수량

    //When
    orderService.order(member.getId(), item.getId(), orderCount);

    //Then
    fail("재고 수량 부족 예외가 발생해야 한다.");
}
