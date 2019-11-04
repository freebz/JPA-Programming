// 예제 7.5 @MappedSuperclass 매핑

@MappedSuperclass
public abstract class BaseEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
    ...
}

@Entity
public class Member extends BaseEntity {

    //ID 상속
    //NAME 상속
    private String email;
    ...
}

@Entity
public class Seller extends BaseEntity {

    //ID 상속
    //NAME 상속
    private String shopName;
    ...
}
