// 예제 8.7 즉시 로딩 설정

@Entity
public class Member {
    //...
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    //...
}
