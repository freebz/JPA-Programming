// 예제 5.22 주문상품(OrderItem) 엔티티

package jpabook.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;        //주문 상품

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;      //주문

    private int orderPrice;   //주문 가격
    private int count;        //주문 수량

    //Getter, Setter
    ...
}
