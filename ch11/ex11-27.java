// 예제 11.27 회원가입

public Long join(Member member) {

    validateDuplicateMember(member); //중복 회원 검증
    memberRepository.save(member);
    return member.getId();
}

private void validateDuplicateMember(Member member) {
    List<Member> findMembers =
	memberRepository.findByName(member.getName());
    if (!findMembers.isEmpty()) {
	throw new IllegalStateException("이미 존재하는 회원입니다.");
    }
}
