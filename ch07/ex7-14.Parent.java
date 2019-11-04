// 예제 7.14 일대일 조인 테이블 매핑

//부모
@Entity
public class Parent {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;
    private String name;

    @OneToOne
    @JoinTable(name = "PARENT_CHILD",
	    joinColumns = @JoinColumn(name = "PARENT_ID"),
	    inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
    )
    private Child child;
    ...
}

//자식
@Entity
public class Child {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;
    private String name;
    ...
}
