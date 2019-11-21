// 예제 15.27 @Fetch 적용

@Entity
public class Member {
    ...
    @org.hibernate.annotations.Fetch(FetchMode.SUBSELECT)
	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private List<Order> orders = new ArrayList<Order>();
    ...
}
