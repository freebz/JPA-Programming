// 예제 9.2 기본 회원 엩티티

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;

    //근무 기간
    @Temporal(TemporalType.DATE) java.util.Date startDate;
    @Temporal(TemporalType.DATE) java.util.Date endDate;

    //집 주소 표현
    private String city;
    private String street;
    private String zipcode;
    //...
}
