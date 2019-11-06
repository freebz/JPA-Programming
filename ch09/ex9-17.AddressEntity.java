// 예제 9.17 값 타입 컬렉션 대신에 일대다 관계 사용

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded Address address;
    ...
}
