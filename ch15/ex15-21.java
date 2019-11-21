// 예제 15.21 비지터 사용 코드

@Test
public void 상속관계와_프록시_VisitorPattern() {
    ...
    OrderItem orderItem = em.find(OrderItem.class, orderItemId);
    Item item = orderItem.getItem();

    //PrintVisitor
    item.accept(new PrintVisitor());
}
