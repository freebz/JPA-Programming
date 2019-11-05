// 예제 8.10 지연 로딩 설정

@Entity
public class Member {
    //...
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    //...
}
