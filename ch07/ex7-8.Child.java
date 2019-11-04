// 예제 7.8 자식 클래스

@Entity
public class Child {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
	    @JoinColumn(name = "PARENT_ID1",
		referencedColumnName = "PARENT_ID1"),
	    @JoinColumn(name = "PARENT_ID2",
		referencedColumnName = "PARENT_ID2")
    })
    private Parent parent;
    
