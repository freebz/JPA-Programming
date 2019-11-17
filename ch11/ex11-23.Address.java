// 예제 11.23 주소 값 타입

package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private string zipcode;

    //Getter, Setter
    ...
}
