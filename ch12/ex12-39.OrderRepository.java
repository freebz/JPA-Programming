// 예제 12.39 주문 리포지토리 리팩토링 전

package jpabook.jpashop.repository;

@Repository
public class OrderRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Order order) {
	em.persist(order);
    }

    public Order findOne(Long id) {
	return em.find(Order.class, id);
    }

    public List<Order> findAll(OrderSearch orderSearch) {

	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Order> cq = cb.createQuery(Order.class);
	Root<Order> o = cq.from(Order.class);
	List<Predicate> criteria = new ArrayList<Predicate>();

	//주문 상태 검색
	if (orderSearch.getOrderStatus() != null) {
	    Predicate status =
		cb.equal(o.get("status"), orderSearch.getOrderStatus());
	    criteria.add(status);
	}
	//회원명 검색
	if (StringUtils.hasText(orderSearch.getMemberName())) {

	    Join<Order, Member> m = o.join("member", JoinType.INNER);
	    Predicate name = cb.like(m.<String>get("name"), "%" +
	        orderSearch.getMemberName() + "%");
	    criteria.add(name);
	}

	cq.where(cb.and(criteria.toArray(new Predicate[criteria.size()])));
	TypedQuery<Order> query = em.createQuery(cq)
	    .setMaxResults(1000); //최대 검색 1000 건으로 제한
	return query.getResultList();
    }
}
