// 예제 8.1 회원 엔티티

@Entity
public class Member {

    private String username;

    @ManyToOne
    private Team team;

    public Team getTeam() {
	return team;
    }
    public String getUsername() {
	return username;
    }
    ...
}
