// 예제 15.17 프록시 인터페이스 제공 사용 2

OrderItem orderItem = em.find(OrderItem.class, saveOrderItem.getId());
orderItem.printItem();
