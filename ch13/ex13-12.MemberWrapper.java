// 예제 13.12 엔티티 래핑 예제

class MemberWrapper {

    private Member member;

    public MemberWrapper(member) {
	this.member = member;
    }

    //읽기 전용 메소드만 제공
    public String getName() {
	member.getName();
    }
}
