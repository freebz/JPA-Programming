// 예제 11.44 상품 목록 ItemController

package jpabook.jpashop.web;

@Controller
public class ItemController {

    @Autowired ItemService itemService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public String list(Model model) {

	List<Item> items = itemService.findItems();
	model.addAttribute("items", items);
	return "items/itemList";
    }
    //...
}
