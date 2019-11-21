// 예제 15.24 히오눠의 주문정보

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Member member;
    ...
}
