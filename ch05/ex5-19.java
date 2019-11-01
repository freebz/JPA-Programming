// 예제 5.19 기존 관계 제거

public void setTeam(Team team) {

    //기존 팀과 관계를 제거
    if (this.team != null) {
	this.team.getMembers().remove(this);
    }
    this.team = team;
    team.getMembers().add(this);
}
