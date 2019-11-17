// 예제 11.32 상품 서비스 코드

package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import japbook.jpashop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void saveItem(Item item) {
	itemRepository.save(item);
    }

    public List<Item> findItems() {
	return itemRepository.findAll();
    }

    public Item fineOne(Long itemId) {
	return itemRepository.findOne(itemId);
    }
}
