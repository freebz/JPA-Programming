// 예제 6.5 일대다 단방향 팀 엔티티

@Entity
public class Team {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "TEAM_ID") //MEMBER 테이블의 TEAM_ID (FK)
    private List<Member> members = new ArrayList<Member>();

    //Getter, Setter ...
}
