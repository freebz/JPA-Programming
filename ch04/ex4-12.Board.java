// 예제 4.12 시퀀스 매핑 코드

@Entity
@SequenceGenerator(
    name = "BOARD_SEQ_GENERATOR",
    sequenceName = "BOARD_SEQ", //매핑할 데이터베이스 시퀀스 이름
    initialValue = 1, allocationSize = 1)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
		    generator = "BOARD_SEQ_GENERATOR")
    private Long id;
    ...
}
