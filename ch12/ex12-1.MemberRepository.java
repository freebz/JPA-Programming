// 예제 12.1 JPA의 반복적인 CRUD

public class MemberRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Member member) {...}
    public Member findOne(Long id) {...}
    public List<Member> findAll() {...}

    public Member findByUsername(String username) {...}

}

public class ItemRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Item item) {...}
    public Member findOne(Long id) {...}
    public List<Member> findAll() {...}
}
