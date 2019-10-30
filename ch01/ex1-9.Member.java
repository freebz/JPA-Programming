// 예제 1.9 참조를 사용하는 객체 모델

class Member {

    String id;       //MEMBER_ID 컬럼 사용
    Team team;	     //참조로 연관관계를 맺는다.
    String username; //USERNAME 컬럼 사용

    Team getTeam() {
	return team;
    }
}

class Team {

    Long id;       //TEAM_ID PK 사용
    String name;   //NAME 컬럼 사용
}
