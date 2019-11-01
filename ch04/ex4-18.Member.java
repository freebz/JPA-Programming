// 예제 4.18 필드 접근 코드

@Entity
@Access(AccessType.FIELD)
public class Member {

    @Id
    private String id;

    private String data1;
    private String data2;
    ...
}
