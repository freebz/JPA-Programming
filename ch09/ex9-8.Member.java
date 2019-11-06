// 예제 9.8 임베디드 타입 재정의

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @Embedded Address homeAddress;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="city", column=@Column(name = "COMPANY_CITY")),
        @AttributeOverride(name="street", column=@Column(name = "COMPANY_STREET")),
	@AttributeOverride(name="zipcode", column=@Column(name = "COMPANY_ZIPCODE"))    
    Address companyAddress;
}
