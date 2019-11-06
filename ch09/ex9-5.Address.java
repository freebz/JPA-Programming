// 예제 9.5 주소 임베디드 타입

@Embeddable
public class Address {

    @Column(name="city") //매핑할 컬럼 정의 가능
    private String city;
    private String street;
    private String zipcode;
    //..
}
