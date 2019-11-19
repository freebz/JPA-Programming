// 예제 12.43 OrderServicefindOrders 리팩토링 전

public List<Order> findOrders(OrderSearch orderSearch) {
    return orderRepository.findAll(orderSearch);
}
