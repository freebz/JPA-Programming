// 예제 4.6 유니크 제약조건

@Entity(name="Member")
@Table(name="MEMBER", uniqueConstraints = {@UniqueConstraint( //추가
    name = "NAME_AGE_UNIQUE",
    columnNames = {"NAME", "AGE"} )})
public class Member {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String username;

    private Integer age;
    ...
}
