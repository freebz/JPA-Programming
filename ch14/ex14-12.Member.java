// 예제 14.12 컨버터 클래스 레벨에 설정하기

@Entity
@Convert(converter=BooleanToYNConverter.class, attributeName = "vip")
public class Member {

    @Id
    private String id;
    private String username;

    private boolean vip;
    ...
}
