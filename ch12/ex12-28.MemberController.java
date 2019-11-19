// 예제 12.28 회원의 아이디로 회원 엔티티 조회

@Controller
public class MemberController {

    @Autowired MemberRepository memberRepository;

    @RequestMapping("member/memberUpdateForm")
    public String memberUpdateForm(@RequestParam("id") Long id, Model model) {

	Member member = memberRepository.findOne(id); //회원을 찾는다.
	model.addAttribute("member", member);
	return "member/memberSaveForm";
    }
}
