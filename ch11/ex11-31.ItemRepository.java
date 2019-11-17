// 예제 11.31 상품 리포지토리 코드

package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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

    public Item fineOne(Long id) {
	return em.find(Item.class, id);
    }

    public List<Item> findAll() {
	return em.createQuery("select i from Item i",
	    Item.class).getResultList();
    }
}
