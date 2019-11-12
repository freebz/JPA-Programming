// 예제 10.36 상태 필드, 연관 필드 설명 예제 코드

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String username;  //상태 필드
    private Integer age; //상태 필드

    @ManyToOne(..)
    private Team team; //연관 필드(단일 값 연관 필드)

    @OneToMany(..)
    private List<Order> orders; //연관 필드(컬렉션 값 연관 필드)
    
