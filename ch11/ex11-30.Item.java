// 예제 11.30 상품 엔티티 코드

package jpabook.jpashop.domain.item;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;        //이름
    private int price;          //가격
    private int stockQuantity;  //재고수량

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<Category>();

    //==비즈니스 로직==//
    public void addStock(int quantity) {
	this.stockQuantity += quantity;
    }

    public void removeStock(int quantity) {
	int restStock = this.stockQuantity - quantity;
	if (restStock < 0) {
	    throw new NotEnoughStockException("need more stock");
	}
	this.stockQuantity = restStock;
    }
    ...
}
