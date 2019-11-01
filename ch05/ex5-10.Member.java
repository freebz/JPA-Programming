// 예제 5.10 매핑한 회원 엔티티

@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    //연관관계 설정
    public void setTeam(Team team) {
	this.team = team;
    }

    //Getter, Setter ...
}
