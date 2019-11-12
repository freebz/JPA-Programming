// 예제 10.50 @NamedQueries 사용

@Entity
@NamedQueries({
    @NamedQuery(
	name = "Member.findByUsername",
	query="select m from Member m where m.username = :username"),
    @NamedQuery(
	name = "Member.count",
	query="select count(m) from Member m")
})
public class Member {...}
