// 예제 12.44 OrderServicefindOrders 리팩토링 후

public List<Order> findOrders(OrderSearch orderSearch) {
    return orderRepository.findAll(orderSearch.toSpecification());
}
