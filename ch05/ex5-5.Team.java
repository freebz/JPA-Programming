// 예제 5.5 매핑한 팀 엔티티

@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    //Getter, Setter ...
}
