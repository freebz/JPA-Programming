// 예제 7.12 일대일 식별 관계 매핑하기

//부모
@Entity
public class Board {

    @ID @GeneratedValue
    @Column(name = "BOARD_ID")
    private Long id;

    private String title;

    @OnetOoNE(MappedBy = "board")
    private BoardDetail boardDetail;
    ...
}

//자식
@Entity
public class BoardDetail {

    @Id
    private Long boardId;

    @MapsId //BoardDetail.boardId 매핑
    @OneToOne
    @JoinColumn(name="BOARD_ID")
    private Board board;

    private String content;
    ...
}
