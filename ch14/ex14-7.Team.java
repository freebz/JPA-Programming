// 예제 14.7 @OrderBy 예제

@Entity
public class Team {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    @OrderBy("username desc, id asc")
    private Set<Member> members = new HashSet<Member>();
    ...
}

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "MEMBER_NAME")
    private String username;

    @ManyToOne
    private Team team;
    ...
}
