// 예제 1.14 MemberDAO 코드

class MemberDAO {

    public Member getMember(String memberId) {
	String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
	...
	//JDBC API, SQL 실행
	return new Member(...);
    }
}
