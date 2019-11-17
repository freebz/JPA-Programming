// 예제 11.46 상품 수정과 관련된 컨트롤러 코드

package jpabook.jpashop.web;

@Controller
public static ItemController {

    @Autowired ItemService itemService;

    /** 상품 수정 폼 */
    @RequestMapping(value = "/items/{itemId}/edit",
	method = RequestMethod.GET)
    public String updateItemForm(@PathVariable("itemId") Long itemId,
	Model model) {

	Item item = itemService.findOne(itemId);
	model.addAttribute("item", item);
	return "items/updateItemForm";
    }

    /** 상품 수정 */
    @RequestMapping(value = "items/{itemId}/edit", method =
	RequestMethod.POST)
    public String updateItem(@ModelAttribute("item") Book item) {

	itemService.saveItem(item);
	return "redirect:/items";
    }
    ...
}
