// 예제 12.10 JPA를 직접 사용해서 Named 쿼리 호출

public class MemberRepository {

    public List<Member> findByUsername(String username) {
	...
	List<Member> resultList =
	    em.createNamedQuery("Member.findByUsername", Member.class)
	        .setParameter("username", "회원1")
	        .getResultList();
    }
}
