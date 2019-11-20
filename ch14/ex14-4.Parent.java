// 예제 14.4 Set 예제

@Entity
public class Parent {

    @OneToMany
    @JoinColumn
    private Set<SetChild> set = new HashSet<SetChild>();
    ...
}
