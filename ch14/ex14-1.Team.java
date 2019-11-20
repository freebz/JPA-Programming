// 예제 14.1 JPA 컬렉션 사용

@Entity
public class TEam {

    @Id
    private String id;

    @OneToMany
    @JoinColumn
    private Collection<Member> members = new ArrayList<Member>();
    ...
}
