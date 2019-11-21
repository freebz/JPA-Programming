// 예제 15.26 BatchSize 적용

@Entity
public class Member {
    ...
    @org.hibernate.annotations.BatchSize(size = 5)
	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private List<Order> orders = new ArrayList<Order>();
    ...
}
