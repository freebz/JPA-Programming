// 예제 15.20 비지터 대상 클래스

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;

    ...

    public abstract void accept(Visitor visitor);
}

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;
    private String isbn;
    //Getter, Setter
    public String getAuthor() {
	return author;
    }

    @Override
    public void accept(Visitor visitor) {
	visitor.visit(this);
    }
}

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {
    ...
    @Override
    public void accept(Visitor visitor) {
	visitor.visit(this);
    }
}

@Entity
@DiscriminatorValue("A")
public class Album extends Item {
    ...
    @Override
    public void accept(Visitor visitor) {
	visitor.visit(this);
    }
}
