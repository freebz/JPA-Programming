// 예제 14.5 List + @OrderColumn 예제

@Entity
public class Board {

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @OneToMany(mappedBy = "board")
    @OrderColumn(name = "POSITION")
    private List<Comment> comments = new ArrayList<Component>();

    ...
}

@Entity
public class Comment {

    @Id @GeneratedValue
    private Long id;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    ...
}
