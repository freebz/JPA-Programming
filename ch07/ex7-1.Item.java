// 예제 7.1 조인 전략 매핑

@Entity
@Inheritance(strategy = InherieanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name; //이름
    private int price;   //가격
    ...
}

@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    ...
}

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {

    private String director; //감독
    private String actor;    //배우
    ...
}
