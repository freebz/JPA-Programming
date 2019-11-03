// 예제 6.26 회원 엔티티와 상품 엔티티 코드

@Entity
public class Member {

    @Id @Column(name = "MEMBER_ID")
    private String id;
    private String username;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();
    ...
}

@Entity
public class Product {

    @Id @Column(name = "PRODUCT_ID")
    private String id;
    private String name;
    ...
}
