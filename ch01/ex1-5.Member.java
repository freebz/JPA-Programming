// 예제 1.5 회원 클래스에 연관된 팀 추가

public class Member {

    private String memberId;
    private String name;
    private String tel;
    private Team team; //추가
    ...
}

// 추가된 팀
class Team {
    ...
    private String teamName;
    ...
}
