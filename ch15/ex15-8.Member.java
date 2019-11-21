// 예제 15.8 프록시 동등성 비교, 회원 엔티티

@Entity
public class Member {

    @Id
    private String id;
    private String name;

    ...
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (this.getClass() != object.getClass()) return false;

	Member member = (Member) obj;

	if (name != null ? !name.equals(member.name) :
	    member.name != null)
	    return false;

	return true;
    }

    @Override
    public int hashCode() {
	return name != null ? name.hashCode() : 0;
    }
}
