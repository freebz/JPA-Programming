// 예제 13.15 스프링 OSIV 주의사항

class MemberController {

    public String viewMember(Long id) {

	Member member = memberService.getMember(id);
	member.setName("XXX"); //보안상의 이유로 고객 이름을 XXX로 변경했다.

	memberService.biz(); //비즈니스 로직
	return view;
    }
}

class MemberService {

    @Transactional
    public void biz() {
	//....비즈니스 로직 실행
    }
}
