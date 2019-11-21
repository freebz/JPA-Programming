// 예제 15.14 프록시 벗기기 예제

...
Item item = orderItem.getItem();
Item unProxyItem = unProxy(item);

if (unProxyItem instanceof Book) {
    System.out.println("proxyItem instanceof Book");
    Book book = (Book) unProxyItem;
    System.out.println("책 저자 = " + book.getAuthor());
}

Assert.assertTrue(item != unProxyItem);
}

//하이버네이트가 제공하는 프록시에서 원본 엔티티를 찾는 기능을 사용하는 메소드
public static <T> T unProxy(Object entity) {
    if (entity instanceof HiberateProxy) {
	entity = ((HibernateProxy) entity)
	            .getHibernateLazyInitializer()
	            .getImplementation();
    }
    return (T) entity;
}
