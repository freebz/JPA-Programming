// 예제 9.3 값 타입 적용 회원 엔티티

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @Embedded Period workPeriod;   //근무 기간
    @Embedded Address homeAddress; //집 주소
    //...
}
