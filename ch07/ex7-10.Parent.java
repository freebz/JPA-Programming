// 예제 7.10 @EmbeddedId 식별 관계 매핑하기

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
public class Child {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId") //ChildId.parentId 매핑
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    private String name;
    ...
}

//자식 ID
@Embeddable
public class ChildId implements Serializable {

    private String parentId; //@MapsId("parentId")로 매핑

    @Column(name = "CHILD_ID")
    private String id;

    //equals, hashCode
    ...
}

//손자
@Entity
public class GrandChild {

    @EmbeddedId
    private GrandChildId id;

    @MapsId("childId") //GrandChildId.childId 매핑
    @ManyToOne
    @JoinColumns({
	    @JoinColumn(name = "PARENT_ID"),
	    @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    private String name;
    ...
}

//손자 ID
@Embeddable
public class GrandChildId implements Serializable {

    private ChildId childId; //@MapsId("childId")로 매핑

    @Column(name = "GRANDCHILD_ID")
    private String id;

    //equals, hashCode
    ...
}
