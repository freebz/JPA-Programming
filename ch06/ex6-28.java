// 예제 6.28 조회 코드

public void find() {

    Long orderId = 1L;
    Order order = em.find(Order.class, orderId);

    Member member = order.getMember();
    Product product = order.getProduct();

    System.out.println("member = " + member.getUsername());
    System.out.println("product = " + product.getName());
    System.out.println("orderAmount = " + order.getOrderAmount());
}
