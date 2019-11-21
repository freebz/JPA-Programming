// 예제 15.1 예외 변환 예제 코드

@Repository
public class NoResultExceptionTestRepository {

    @PersistenceContext EntityManager em;

    public Member findMember() {
	//조회된 데이터가 없음
	return em.createQuery("select m from Member m", Member.class)
	    .getSingleResult();
    }
}
