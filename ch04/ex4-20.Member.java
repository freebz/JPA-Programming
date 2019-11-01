// 예제 4.20 필드, 프로퍼티 접근 함께 사용

@Entity
public class Member {

    @Id
    private String id;

    @Trasient
    private String firstName;

    @Transient
    private String lastName;

    @Access(AccessType.PROPERTY)
    public String getFullName() {
	return firstName + lastName;
    }
    ...
}
