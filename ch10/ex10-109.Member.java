// 예제 10.109 결과 매핑을 정의

@Entity
@SqlResultSetMapping(name = "memberWithOrderCount",
    entities = (@EntityResult(entityClass = Member.class)),
    columns = (@ColumnResult(name = "ORDER_COUNT"))
)
public class Member {...}
