// 예제 7.22 매핑 정보를 상속

//회원
@Entity
public class Member extends BaseEntity { ... }

//주문
@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity { ... }
