// 예제 13.2 주문 엔티티 코드

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //지연 로딩 전략
    private Member member; //주문 회원
    ...
}
