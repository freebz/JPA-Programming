// 예제 15.3 테스트와 트랜잭션 범위 예제 코드

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appConfig.xml")
@Transactioanl //트랜잭션 안에서 테스트를 실행한다.
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
	assertTrue(member == findMember); //참조값 비교
    }
}

@Transactional
public class MemberService {

    @Autowired MemberRepository memberRepository;

    public Long join(Member member) {
	...
	memberRepository.save(member);
	return member.getId();
    }
}

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
}
