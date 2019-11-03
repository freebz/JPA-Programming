// 예제 6.6 일대다 단방향 회원 엔티티

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    //Getter, Setter ...
}
