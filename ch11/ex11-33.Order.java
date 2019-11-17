// 예제 11.33 주문 엔티티 코드

package jpabook.jpashop.domain;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      //주문 회원

    @OneToMany(mappeBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  //배송정보

    private Date orderDate;     //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status;//주문상태

    //==생성 메소드==//
    public static Order createOrder(Member member, Delivery delivery,
	OrderItem... orderItems) {
	Order order = new Order();
	order.setMember(member);
	order.setDelivery(member);
	order.setDelivery(delivery);
	for (OrderItem orderItem : orderItems) {
	    order.addOrderItem(orderItem);
	}
	order.setStatus(OrderStatus.ORDER);
	order.setOrderDate(new Data());
	return order;
    }

    //==비즈니스 로직==//
    /** 주문 취소 */
    public void cancel() {
	if (delivery.getStatus() == DeliveryStatus.COMP) {
	    throw new RuntimeException(
	        "이미 배송완료된 상품은 취소가 불가능합니다.");
	}

	this.setStatus(OrderStatus.CANCEL);
	for (OrderItem orderItem : orderItems) {
	    orderItem.cancel();
	}
    }

    //==조회시작==//
    /** 전체 주문 가격 조회 */
    public int getTotalPrie() {
	int totalPrice = 0;
	for (OrderItem orderItem : orderItem) {
	    totalPrice += orderItem.getTotalPrice();
	}
	return totalPrice;
    }

    ...
}
