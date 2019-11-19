// 예제 13.4 글로벌 페치 전략 - 즉시 로딩 설정

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER) //즉시 로딩 전략
    private Member member; //주문 회원
    ...
}
