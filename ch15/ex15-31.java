// 예제 15.31 하이버네이트 scroll 사용 예제

EntityTransaction tx = em.getTransaction();
Session session = em.unwrap(Session.class);

tx.begin();
ScrollableResults scroll = session.createQuery
    ("select p from Product p")
        .setCacheMode(CacheMode.IGNORE) //2차 캐시 기능을 끈다.
        .scroll(ScrollMode.FORWARD_ONLY);

int count = 0;

while (scroll.next()) {
    Product p = (Product) scroll.get(0);
    p.setPrice(p.getPrice() + 100);

    count++;
    if (count % 100 == 0) {
	session.flush(); //플러시
	session.clear(); //영속성 컨텍스트 초기화
    }
}
tx.commit();
session.close();
