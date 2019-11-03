// 예제 6.17 역방향 추가

@Entity
public class Product {

    @Id
    private String id;

    @ManyToMany(mappedBy = "products") //역방향 추가
    private List<Member> members;
    ...
}
