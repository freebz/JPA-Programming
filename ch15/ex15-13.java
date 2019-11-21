// 예제 15.13 다형성과 프록시 조회 실행

@Test
public void 상속관계와_프록시_도메인모델() {

    //테스트 데이터 준비
    Book book = new Book();
    book.setName("jpabook");
    book.setAuthor("kim");
    em.persist(book);

    OrderItem saveOrderItem = new OrderItem();
    saveOrderItem.setItem(book);
    em.persist(saveOrderItem);

    em.flush();
    em.clear();

    //테스트 시작
    OrderItem orderItem =
	em.find(OrderItem.class, saveOrderItem.getId());
    Item item = orderItem.getItem();

    System.out.println("item = " + item.getClass());

    //결과 검증
    Assert.assertFalse( item.getClass() == Book.class );
    Assert.assertFalse( item instanceof Book );
    Assert.assertTrue( item instanceof Item );
}
