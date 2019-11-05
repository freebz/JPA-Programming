// 예제 8.15 자식 엔티티

@Entity
public class Child {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Parent parent;
    ...
