// 예제 4.19 프로퍼티 접근 코드

@Entity
@Access(AccessType.PROPERTY)
public class Member {

    private String id;

    private String data1;
    private String data2;

    @Id
    public String getId() {
	return id;
    }

    @Column
    public String getData1() {
	return data1;
    }

    @public String getData2() {
	return data2;
    }
}
