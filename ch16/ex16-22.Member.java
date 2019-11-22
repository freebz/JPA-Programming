// 예제 16.22 NamedQuery에 쿼리 캐시 적용

@Entity
@NamedQuery(
	hints = @QueryHint(name = "org.hibernate.cacheable",
	    value = "true"),
	name = "Member.findByUsername",
	query = "select m.address from Member m where m.name = :username"
)
public class Member {
    ...
