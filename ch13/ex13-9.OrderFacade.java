// 예제 13.9 FACADE 계층 추가

class OrderFacade {

    @Autowired OrderService orderService;

    public Order findOrder(id) {
	Order order = orderService.findOrder(id);
	//프리젠테이션 계층이 필요한 객체를 강제로 초기화한다.
	order.getmember().getName();
	return order;
    }
}

class OrderService {

    public Order findOrder(id) {
	return orderRepository.findOrder(id);
    }
}
