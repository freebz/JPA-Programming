// 예제 12.30 페이징과 정렬 예제

@RequestMapping(value = "/members", method = RequestMethod.GET)
public String list(Pageable pageable, Model model) {

    Page<Member> page = memberService.findMembers(pageable);
    model.addAttribute("members", page.getContent());
    return "members/memberList";
}
