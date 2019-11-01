// 예제 5.21 주문(Order) 엔티티

package jpabook.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @BeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      //주문회원

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems =
	new ArrayList<OrderItem>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;     //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status;//주문상태

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

    //Getter, Setter
    ...
}

public enum OrderStatus {
    ORDER, CANCEL
}
