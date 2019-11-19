// 예제 13.10 OSIV의 문제점 예제

class MemberController {

    public String viewMember(Long id) {
	Member member = memberService.getMember(id);
	member.setName("XXX"); //보안상의 이유로 고객 이름을 XXX로 변경했다.
	model.addAttribute("member", member);
	...
    }
}
