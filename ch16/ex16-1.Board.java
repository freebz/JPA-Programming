// 예제 16.1 엔티티에 버전 관리 추가

@Entity
public class Board {

    @Id
    private String id;
    private String title;

    @Version
    private Integer version;
}
