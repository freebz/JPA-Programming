// 예제 6.9 일대다 양방향 회원 엔티티

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable = false,
	updatable = false)
    private Team team;

    //Getter, Setter ...
}
