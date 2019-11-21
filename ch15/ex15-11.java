// 예제 15.11 프록시 부모 타입으로 조회

@Test
public void 부모타입으로_프록시조회() {

    //테스트 데이터 준비
    Book saveBook = new Book();
    saveBook.setName("jpabook");
    saveBook.setAuthor("kim");
    em.persist(saveBook);

    em.flush();
    em.clear();

    //테스트 시작
    Item proxyItem = em.getReference(Item.class, saveBook.getId());
    System.out.println("proxyItem = " + proxyItem.getClass());

    if (proxyItem instanceof Book) {
	System.out.println("proxyItem instanceof Book");
	Book book = (Book) proxyItem;
	System.out.println("책 저자 = " + book.getAuthor());
    }

    //결과 검증
    Assert.assertFalse( proxyItem.getClass() == Book.class );
    Assert.assertFalse( proxyItem instanceof Book );
    Assert.assertTrue( proxyItem instanceof Item );
}
