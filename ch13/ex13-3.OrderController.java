// 예제 13.3 컨트롤러 로직

class OrderController {

    public String view(Long orderId) {

	Order order = orderService.findOne(orderId);
	Member member = order.getMember();
	member.getName(); //지연 로딩 시 예외 발생
	...
    }
    ...
}
