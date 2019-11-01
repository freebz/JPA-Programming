// 예제 4.15 TABLE 전략 매핑 코드

@Entity
@TableGenerator(
    name = "BOARD_SEQ_GENERATOR",
    table = "MY_SEQUENCES",
    pkColumnValue = "BOARD_SEQ", allocationSize = 1)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
        generator = "BOARD_SEQ_GENERATOR")
    private Long id;
    ...
}
