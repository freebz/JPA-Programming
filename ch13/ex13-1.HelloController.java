// 예제 13.1 트랜잭션 범위의 영속성 컨텍스트 예제

@Controller
class HelloController {

    @Autowired HelloService helloService;

    public void hello() {
	//반환된 member 엔티티는 준영속 상태다.
	Member member = helloService.logic();
    }
}

@Service
class HelloService {

    @PersistenceContext //엔티티 매니저 주입
    EntityManager em;

    @Autowired Repository1 repository1;
    @Autowired Repository2 repository2;

    //트랜잭션 시작
    @Transactional
    public void logic() {
	repository1.hello();

	//member는 영속 상태다.
	Member member = repository2.findMember();
	return member;
    }
    //트랜잭션 종료
}

@Repository
class Repository1 {

    @PersistenceContext
    EntityManager em;

    public void hello() {
	em.xxx(); //A. 영속성 컨텍스트 접근
    }
}

@Repository
class Repository2 {

    @PersistenceContext
    EntityManager em;

    public Member findMember() {
	return em.find(Member.class, "id1"); //B. 영속성 컨텍스트 접근
    }
}
