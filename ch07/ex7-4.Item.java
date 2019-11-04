// 예제 7.4 구현 클래스마다 테이블 전략 매핑

@Entity
@Inheritance(strategy = InherieanceType.TABLE_PER_CLASS)
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name; //이름
    private itn price;   //가격
    ...
}

@Entity
public class Album extends Item { ... }

@Entity
public class Movie extends Item { ... }

@Entity
public class Book extends Item { ... }
