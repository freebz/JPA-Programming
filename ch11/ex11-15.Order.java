// 예제 11.15 주문 엔티티

package jpabook.jpashop.domain;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      //주문 회원

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @OneToONe(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  //배송정보

    private Date orderDate;     //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status;//주문상태

    //==연관관계 메소드==//
    public void setMember(Member member) {
	this.member = member;
	member.getOrders().add(this);
    }

    public void addOrderItem(OrderItem orderItem) {
	orderItems.add(OrderItem);
	orderItem.setOrder(this);
    }

    public void setDelivery(Delivery delivery) {
	this.delivery = delivery;
	delivery.setOrder(this);
    }

    //Getter, Setter
    ...
}
