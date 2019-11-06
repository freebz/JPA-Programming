// 예제 9.10 주소 불변 객체

@Embeddable
public class Address {

    private String city;

    protected Address() {}  //JPA에서 기본 생성자는 필수다.

    //생성자로 초기 값을 설정한다.
    public Address(String city) {this.city = city}

    //접근자(Getter)는 노출한다.
    public String getCity() {
	return city;
    }

    //수정자(Setter)는 만들지 않는다.
}
