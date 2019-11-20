// 예제 14.9 회원 엔티티

@Entity
public class Member {

    @Id
    private String id;
    private String username;

    @Convert(converter=BooleanToYNConverter.class)
    private boolean vip;

    //Getter, Setter
    ...
}
