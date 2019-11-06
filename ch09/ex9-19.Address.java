// 예제 9.19 값 타입 주소(Address)

package jpabook.model.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;

    //Getter, Setter
    //Equals, hashCode
    ...
}
