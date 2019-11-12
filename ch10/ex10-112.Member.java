// 예제 10.112 엔티티 조회

@Entity
@NamedNativeQuery(
    name = "Member.memberSQL",
    query = "SELECT ID, AGE, NAME, TEAM_ID " +
        "FROM MEMBER WHERE AGE > ?",
    resultClass = Member.class
)
public class Member {...}
