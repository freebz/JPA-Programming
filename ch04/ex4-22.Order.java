// 예제 4.22 주문(Order) 엔티티

package jpabook.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;     //주문 날짜

    @Enumerated(EnumType.STRING)
    private OrderStatus status;//주문 상태

    //Getter, Setter
    ...
}
