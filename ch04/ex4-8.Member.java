// 예제 4.8 기본 키 매핑 시작

@Entity
public class Member {

    @Id
    @Column(name = "ID")
    private String id;
    ...
}
