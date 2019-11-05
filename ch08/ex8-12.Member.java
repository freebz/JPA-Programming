// 예제 8.12 회원 엔티티

@Entity
public class Member {

    @Id
    private String id;
    private String username;
    private Integer age;

    @ManyToOne(fetch = FetchType.EAGER)
    private Team team;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<Order> orders;

    //Getter Setter ...
}
