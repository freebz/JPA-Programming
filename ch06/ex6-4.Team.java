// 예제 6.4 팀 엔티티

@Entity
public class Team {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<Member>();

    public void addMember(Member member) {
	this.members.add(member);
	if (member.getTeam() != this){  //무한루프에 빠지지 않도록 체크
	    member.setTeam(this);
	}
    }
    ...
}
