// 예제 7.16 다대일 양방향 조인 테이블 매핑

//부모
@Entity
public class Parent {

    @ID @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "parent")
    private List<Child> child = new ArrayList<Child>();
    ...
}

//자식
@Entity
public class Child {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;
    private String name;

    @ManyToOne(optional = false)
    @JoinTable(name = "PARENT_CHILD",
	    joinColumns = @JoinColumn(name = "CHILD_ID"),
	    inverseJoinColumns = @JoinColumn(name = "PARENT_ID")
    )
    private Parent parent;
    ...
}
