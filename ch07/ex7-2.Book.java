// 예제 7.2 ID 재정의

@Entity
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID") //ID 재정의
public class Book extends Item {

    private String author; //작가
    private String isbn;   //ISBN
    ...
}
