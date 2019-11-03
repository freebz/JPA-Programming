// 예제 6.30 배송(Delivery)

package jpabook.model.entity;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneragedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    //Getter, Setter
    ...
}
