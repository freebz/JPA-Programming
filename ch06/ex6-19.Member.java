// 예제 6.19 회원 코드

@Entity
public class Member {

    @Id @Column(name = "MEMBER_ID")
    private String id;

    //역방향
    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts;

    ...
}
