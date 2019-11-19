// 예제 12.29 도메인 클래스 컨버터 적용

@Controller
public class MemberController {

    @RequestMapping("member/memberUpdateForm")
    public String memberUpdateForm(@RequestParam("id") Member member, Model model) {
	model.addAttribute("member", member);
	return "member/memberSaveForm";
    }
}
