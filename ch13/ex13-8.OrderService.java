// 예제 13.8 프록시 강제 초기화

class OrderService {

    @Transactional
    public Order findOrder(id) {
	Order order = orderRepository.findOrder(id);
	order.getMember().getName(); //프록시 객체를 강제로 초기화한다.
	return order;
    }
}
