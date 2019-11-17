// 예제 11.49 상품 주문과 관련된 컨트롤러 코드

package jpabook.jpashop.web;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.domain.OrderSearch;
import jpabook.jpashop.service.ItemService;
import jpabook.jpashop.service.MemberService;
import jpabook.jpashop.service.OrderService;
import org.springframework.beans.factory.annoation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class OrderController {

    @Autowired OrderService orderService;
    @Autowired MemberService memberService;
    @Autowired ItemService itemService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String createForm(Model model) {

	List<Member> members = memberService.findMembers();
	List<Item> items = itemService.findItems();

	model.addAttribute("members", members);
	model.addAttribute("items", items);

	return "order/orderForm";
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order(@RequestParam("memberId") Long memberId,
			    @RequestParam("itemId")   Long itemId,
			    @RequestParam("count")    int count) {

	orderService.order(memberId, itemId, count);
	return "redirect:/orders";
    }
    ...
}
