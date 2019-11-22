// 예제 16.6 캐시 모드 설정

@Cacheable
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    ...
}
