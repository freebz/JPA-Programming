// 예제 7.9 @IdClass로 식별 관계 매핑하기

//부모
@Entity
public class Parent {

    @Id @Column(name = "PARENT_ID")
    private String id;
    private String name;
    ...
}

//자식
@Entity
@IdClass(ChildId.class)
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    @Id @Column(name = "CHILD_ID")
    private String childId;

    private String name;
    ...
}

//자식 ID
public class ChildId implements Serializable {

    private String parent; //Child.parent 매핑
    private String childId;//Child.childId 매핑

    //equals, hashCode
    ...
}

//손자
@Entity
@IdClass(GrandChildId.class)
public class GrandChild {

    @Id
    @ManyToOne
    @JoinColumns({
	    @JoinColumn(name = "PARENT_ID"),
	    @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    @Id @Column(name = "GRANDCHILD_ID")
    private String id;

    private String name;
    ...
}

//손자 ID
public class GrandChildId implements Serializable {

    private ChildId child; //GrandChild.child 매핑
    private String id;     //GrandChild.id 매핑

    //equals, hashCode
    ...
}
