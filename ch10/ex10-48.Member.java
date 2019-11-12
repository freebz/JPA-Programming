// 예제 10.48 @NamedQuery 어노테이션으로 Named 쿼리 정의

@Entity
@NamedQuery(
    name="Member.findByUsername",
    query="select m from Member m where m.username = :username")
public class Member {
    ...
}
