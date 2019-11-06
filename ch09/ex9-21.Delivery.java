// 예제 9.21 배송(Delivery)에 값 타입 적용

package jpabook.model.entity;

@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    //private String city;        //삭제
    //private String street;      //삭제
    //private String zipcode;     //삭제

    @Embedded                     //추가
    private Address address;      //추가

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //ENUM [READY(준비), COMP(배송)]
    ...
}
