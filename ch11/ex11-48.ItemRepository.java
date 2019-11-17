// 예제 11.48 ItemRepository

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
    //...
}
