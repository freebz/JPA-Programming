// 예제 15.32 하이버네이트 무상태 세션 사용 예제

SessionFactory sessionFactory =
    entityManagerFactory.unwrap(SessionFactory.class);
StatelessSession session = sessionFactory.openStatelessSession();
Transaction tx = session.beginTransaction();
ScrollableResults scroll = session.createQuery
    ("select p from Product p").scroll();

while (scroll.next()) {
    Product p = (Product) scroll.get(0);
    p.setPrice(p.getPrice() + 100);
    session.update(p); //직접 update를 호출해야 한다.
}
tx.commit();
session.close();
