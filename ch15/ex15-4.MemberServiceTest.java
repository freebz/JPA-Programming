// 예제 15.4 영속성 컨텍스트가 다를 때 엔티티 비교 예제 코드

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appConfig.xml")
//@Transactioanl //테스트에서 트랜잭션을 사용하지 않는다.
public class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberREpository memberRepository;

    @Test
    public void 회원가입() throws Exception {

	//Given
	Member member = new Member("kim");

	//When
	Long saveId = memberService.join(member);

	//Then
	Member findMember = memberRepository.findOne(saveId);
	//findMember는 준영속 상태다.

	//둘은 다른 주소값을 가진 인스턴스다. 테스트가 실패한다.
	assertTrue(member == findMember);
    }
}

@Transactional //서비스 클래스에서 트랜잭션이 시작된다.
public class MemberService {

    @Autowired MemberRepository memberRepository;

    public Long join(Member member) {
	...
	memberRepository.save(member);
	return member.getId();
    }
}

@Repository
@Transactional //예제를 구성하기 위해 추가했다.
public class MemberRepository {

    @PersistenceContext
    EntityManager em;

    public void save(Member member) {
	em.persist(member);
    }

    public Member findOne(Long id) {
	return em.find(Member.class, id);
    }
}
