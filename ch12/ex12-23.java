// 예제 12.23 명세 사용 코드

import static org.springframework.data.jpa.domain.Specifications.*; //where()
import static jpabook.jpashop.domain.spec.OrderSpec.*;

public List<Order> findOrders(String name) {

    List<Order> result = orderRepository.findAll(
            where(memberName(name)).and(isOrderStatus())
    );

    return result;
}
