// 예제 10.113 결과 매핑 사용

@Entity
@SqlResultSetMapping( name = "memberWithOrderCount",
    entities = {@EntityResult(entityClass = Member.class)},
    columns = {@ColumnResult(name = "ORDER_COUNT")}		      
)
@NamedNativeQuery(
    name = "Member.memberWithOrderCount",
    query = "SELECT M.ID, AGE , NAME , TEAM_ID , I.ORDER_COUNT " +
        "FROM MEMBER M " +
        "LEFT JOIN " +
        "    (SELECT IM.ID, COUNT(*) AS ORDER_COUNT " +
        "     FROM ORDERS O, MEMBER IM " +
        "     WHERE O.MEMBER_ID = IM.ID) I " +
        "ON M.ID = I.ID",
    resultSetMapping = "memberWithOrderCount"
)
public class Member {...}
