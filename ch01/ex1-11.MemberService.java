// 예제 1.11 회원 조회 비즈니스 로직

class MemberService {
    ...
    public void process() {

	Member member = memberDAO.find(memberId);
	member.getTeam(); //member->team 객체 그래프 탐색이 가능한가?
	member.getOrder().getDelivery(); //???
    }
}
