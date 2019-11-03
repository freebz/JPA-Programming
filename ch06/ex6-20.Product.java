// 예제 6.20 상품 코드

@Entity
public class Product {

    @Id @Column(name = "PRODUCT_ID")
    private String id;

    private String name;

    ...
}
