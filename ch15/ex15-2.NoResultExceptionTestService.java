// 예제 15.2 예외를 변환하지 않는 코드

@Repository
public class NoResultExceptionTestService {

    @PersistenceContext EntityManager em;

    public Member findMember() throws javax.persistence.NoResultException
    {
	return em.createQuery("select m from Member m", Member.class)
	    .getSingleResult();
    }
}
