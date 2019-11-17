// 예제 11.41 주문 취소 테스트 코드

@Test
public void 주문취소() {

    //Given
    Member member = createMember();
    Item item = createBook("시골 JPA", 10000, 10); //이름, 가격, 재고
    int orderCount = 2;

    Long orderId = orderService.order(member.getId(), item.getId(),
	orderCount);

    //When
    orderService.cancelOrder(orderId);

    //Then
    Order getOrder = orderRepository.findOne(orderId);

    assertEquals("주문 취소시 상태는 CANCEL 이다.",OrderStatus.CANCEL,
	getOrder.getStatus());
    assertEquals("주문이 취소된 상품은 그만큼 재고가 증가해야 한다.", 10,
	item.getStockQuantity());
}
