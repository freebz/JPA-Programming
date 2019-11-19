// 예제 12.42 검색 객체가 Specification 생성하도록 추가

package jpabook.jpashop.domain;

import org.springframework.data.jpa.domain.Specifications;

import static jpabook.jpashop.domain.OrderSpec.memberNameLike;
import static jpabook.jpashop.domain.OrderSpec.orderStatusEq;
import static org.springframework.data.jpa.domain.Specifications.where;

public class OrderSearch {

    private String memberName;      //회원명
    private OrderStatus orderStatus;//주문 상태

    //...Getter, Setter

    //추가
    public Specifications<Order> toSpecification() {
	return where(memberNameLike(memberName))
	        .and(orderStatusEq(orderStatus));
    }

}
