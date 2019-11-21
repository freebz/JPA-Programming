// 예제 15.16 프록시 인터페이스 제공 사용 1

@Entity
public class OrderItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    ...

    public void printItem() {
	System.out.println("TITLE="+item.getTitle());
    }
}
