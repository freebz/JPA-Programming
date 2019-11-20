// 예제 14.3 Collection, List 예제

@Entity
public class Parent {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn
    private Collection<CollectionChild> collection =
	new ArrayList<CollectionChild>();

    @OneToMany
    @JoinColumn
    private List<ListChild> list = new ArrayList<ListChild>();
    ...
}
