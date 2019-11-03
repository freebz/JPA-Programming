// 예제 6.29 주문(Order) 엔티티

package jpabook.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      //주문 회원

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems =
	new ArrayList<OrderItem>();

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  //배송정보

    private Date orderDate;     //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStauts status; //주문상태


    //==연관관계 메소드==//
    public void setMember(Member member) {
	//기존 관계 제거
	if (this.member != null) {
	    this.member.getOrders().remove(this);
	}
	this.member = member;
	member.getOrders().add(this);
    }

    public void addOrderItem(OrderItem orderItem) {
	orderItems.add(orderItem);
	orderItem.setOrder(this);
    }

    public void setDelivery(Delivery delivery) {
	this.delivery = delivery;
	delivery.setOrder(this);
    }

    //Getter, Setter
    ...
}
