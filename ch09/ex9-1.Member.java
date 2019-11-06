// 예제 9.1 기본값 타입

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int age;
    ...
}
