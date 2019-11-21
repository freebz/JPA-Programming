// 예제 15.15 프록시 인터페이스 제공 정의

public interface TitleView {
    String getTitle();
}

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstrace class Item implements TitleView {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    //Getter, Setter
}

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;
    private String isbn;

    @Override
    public String getTitle() {
	return "[제목:" + getName() + " 저자:" + author + "]";
    }
}

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {

    private String director;
    private String actor;

    //Getter, Setter

    @Override
    public String getTitle() {
	return "[제목:" + getName() + " 감독:" + director +
	    " 배우:" + actor + "]";
    }
}
