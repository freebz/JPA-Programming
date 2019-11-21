// 예제 15.12 다형성과 프록시 조회 정의

@Entity
public class OrderItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    public Item getItem() {
	return item;
    }
    public void setItem(Item item) {
	this.item = item;
    }

    ...
}
