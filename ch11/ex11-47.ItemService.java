// 예제 11.47 ItemService

package jpabook.jpashop.service;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void saveItem(Item item) {
	itemRepository.save(item);
    }
    //...
}
