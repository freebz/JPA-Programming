// 예제 8.20 주문(Order)

package jpabook.model.entity;

@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      //주문 회원

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  //배송정보

    ...
}
