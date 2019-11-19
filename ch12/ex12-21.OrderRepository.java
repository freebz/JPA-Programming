// 예제 12.21 JpaSpecificationExecutor 상속

public interface OrderRepository extends JpaRepository<Order, Long>,
JpaSpecificationExecutor<Order> {

}
