// 예제 12.8 @NamedQuery 어노테이션으로 Named 쿼리 정의

@Entity
@NamedQuery(
    name="Member.findByUsername",
    query="select m from Member m where m.username = :username")
)
public class Member {
    ...
}
