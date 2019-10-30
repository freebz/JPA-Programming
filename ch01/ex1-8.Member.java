// 예제 1.8 테이블에 맞춘 객체 모델

class Member {

    String id;      //MEMBER_ID 컬럼 사용
    Long teamId;    //TEAM_ID FK 컬럼 사용
    String username;//USERNAME 컬럼 사용
}

class Team {

    Long id;       //TEAM_ID PK 사용
    String name;   //NAME 컬럼 사용
}
