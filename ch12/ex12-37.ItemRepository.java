// 예제 12.37 상품 리포지토리 리팩토링 전

package jpabook.jpashop.repository;

@Repository
public class ItemRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Item item) {
	if (item.getId() == null) {
	    em.persist(item);
	} else {
	    em.merge(item);
	}
    }

    public Item findOne(Long id) {
	return em.find(Item.class, id);
    }

    public List<Item> findAll() {
	return em.createQuery("select i from Item i",Item.class)
	    .getResultList();
    }
}
