// 예제 10.1 회원 엔티티

@Entity(name="Member") //name 속성의 기본값은 클래스 명
public class Member {

    @Column(name = "name")
    private String username;
    //...
}
