// 예제 8.23 영속성 전이를 사용하기 전

Delivery delivery = new Delivery();
em.persist(delivery);   //persist

OrderItem orderItem1 = new OrderItem();
OrderItem orderItem2 = new OrderItem();
em.persist(orderItem1); //persist
em.persist(orderItem2); //persist

Order order = new Order();
order.setDelivery(delivery);
order.addOrderItem(orderItem1);
order.addOrderItem(orderItem2);

em.persist(order); //persist
