// 예제 15.25 지연 로딩 설정

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<Order>();
    ...
}
