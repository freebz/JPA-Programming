// 예제 12.24 OrderSpec 명세 정의 코드

package jpabook.jpashop.domain;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StirngUtils;
import javax.persistence.criteria.*;

public class OrderSpec {

    public static Specification<Order> memberName(final String memberName) {
	return new Specification<Order>() {
	    public Predicate toPredicate(Root<Order> root,
		CriteriaQuery<?> query, CriteriaBuilder builder) {

		if (StringUtils.isEmpty(memberName)) return null;

		Join<Order, Member> m = root.join("member",
		    JoinType.INNER); //회원과 조인
		return builder.equal(m.get("name"), memberName);
	    }
	};
    }

    public static Specification<Order> isOrderStatus() {
	return new Specification<Order>() {
	    public Predicate toPredicate(Root<Order> root,
		CriteriaQuery<?> query, CriteriaBuilder Builder) {

		return builder.equal(root.get("status"),
		    OrderStatus.ORDER);
	    }
	};
    }
}
