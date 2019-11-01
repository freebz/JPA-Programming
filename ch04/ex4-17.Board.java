// 예제 4.17 AUTO 전략 매핑 코드

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    ...
}
