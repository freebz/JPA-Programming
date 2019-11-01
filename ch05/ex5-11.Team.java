// 예제 5.11 매핑한 팀 엔티티

@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    //==추가==//
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<Member>();

    //Getter, Setter ...
}
