// 예제 8.24 영속성 전이를 사용한 후

Delivery delivery = new Delivery();
OrderItem orderItem1 = new OrderItem();
OrderItem orderItem2 = new OrderItem();

Order order = new Order();
order.setDelivery(delivery);
order.addOrderItem(orderItem1);
order.addOrderItem(orderItem2);

em.persist(order); //delivery, orderItems 플러시 시점에 영속성 전이
