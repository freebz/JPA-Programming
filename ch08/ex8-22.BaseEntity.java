// 예제 8.22 영속성 전이 설정

package jpabook.model.entity;

@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {
    ...
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  //배송정보

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems =
	new ArrayList<OrderItem>();

    public void addOrderItem(OrderItem orderItem) {
	orderItems.add(orderItem);
	orderItem.setOrder(this);
    }

    public void setDelivery(Delivery delivery) {
	this.delivery = delivery;
	delivery.setOrder(this);
    }
    ...
}
