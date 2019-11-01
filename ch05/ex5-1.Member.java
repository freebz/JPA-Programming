// 예제 5.1 회원과 팀 클래스

public class Member {

    private String id;
    private String username;

    private Team team; //팀의 참조를 보관

    public void setTeam(Team team) {
	this.team = team;
    }

    //Getter, Setter ...
}

public class Team {

    private String id;
    private String name;

    //Getter, Setter ...
}
