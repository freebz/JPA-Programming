// 예제 7.19 부모 엔티티 상품(Item)

package jpabook.model.entity.item;

@Entity
@Inheritance(strategy = InherieanceType.SINGLE_TABLE)
@DescriminatorColumn(name = "DTYPE")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;          //이름
    private int price;            //가격
    private int stockQuantity;    //재고수량

    @ManytoMany(mappedBy = "items")
    private List<Category> categories =
	new ArrayList<Category>();
    //Getter, Setter
    ...
}
