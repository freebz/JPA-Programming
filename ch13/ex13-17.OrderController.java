// 예제 13.17 컨트롤러에서 리포지토리 직접 접근

class OrderController {

    @Autowired OrderService orderService;
    @Autowired OrderRepository orderRepository;

    public String orderRequest(Order order, Model model) {

	long Id = orderService.order(order); //상품 구매

	//리포지터리 직접 접근
	Order orderResult = orderRepository.findOne(id);
	model.addAttribute("order", orderResult);
	...
    }
}

@Transactional
class OrderService {

    @Autowired OrderRepository orderRepository;

    public Long order(order) {
	... 비즈니스 로직
        return orderRepository.save(order);
    }
}

class OrderRepository {

    @PersistenceContext EntityManager em;

    public Order findOne(Long id) {
	return em.find(Order.class, id);
    }
}
