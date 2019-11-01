// 예제 5.23 상품(Item) 엔티티

package jpabook.model.entity;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;        //이름
    private int price;          //가격
    private int stockQuantity;  //재고수량

    //Getter, Setter
    ...
}
