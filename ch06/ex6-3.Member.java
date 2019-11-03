// 예제 6.3 회원 엔티티

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    privaet Team team;

    public void setTeam(Team team) {
	this.team = team;

	//무한루프에 빠지지 않도록 체크
	if(!team.getMembers().contains(this)){
	    team.getMembers().add(this);
	}
    }
