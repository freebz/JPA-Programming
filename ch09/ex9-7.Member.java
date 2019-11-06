// 예제 9.7 같은 임베디드 타입을 가지고 있는 회원

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @Embedded Address homeAddress;
    @Embedded Address companyAddress;

}
