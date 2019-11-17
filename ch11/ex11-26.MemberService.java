// 예제 11.26 회원 서비스 코드

package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class memberService {

    @Autowired
    MemberRepository memberRepository;

    /**
     * 회원가입
     */
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

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
	return memberRepository.findAll();
    }

    public Member findOne(Long memberId) {
	return memberRepository.findOne(memberId);
    }
}
