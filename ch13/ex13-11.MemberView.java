// 예제 13.11 엔티티를 읽기 전용 인터페이스로 제공 예제

interface MemberView {
    public String getName();
}

@Entity
class Member implements MemberView {
    ....
}

class MemberService {

    public MemberView getMember(id) {
	return memberRepository.findById(id);
    }
}
