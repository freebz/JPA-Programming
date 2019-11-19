// 예제 12.35 회원 리포지토리 리팩토링 전

package jpabook.jpashop.repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Member member) {
	em.persist(member);
    }

    public Member findOne(Long id) {
	return em.find(Member.class, id);
    }

    public List<Member> findAll() {
	return em.createQuery("select m from Member m", Member.class)
	        .getResultList();
    }

    public List<Member> findByName(String name) {
	return em.createQuery("select m from Member m where m.name
            = :name", Member.class)
	        .setParameter("name", name)
	        .getResultList();
    }
}
