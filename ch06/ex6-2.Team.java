// 예제 6.2 팀 엔티티

@Entity
public class Team {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private Status name;

    //Getter, Setter ...
    ...
}
