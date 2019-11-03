// 예제 6.1 회원 엔티티

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEMA_ID")
    private Team team;

    //Getter, Setter ...
    ...
}
