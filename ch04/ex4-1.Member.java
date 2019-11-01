// 예제 4.1 회원 엔티티

package jpabook.start;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String username;

    private Integer age;

    //== 추가 ==
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastMOdifiedDate;

    @Lob
    private String description;

    //Getter, Setter
    ...
}

package jpabook.start;

public enum RoleType {
    ADMIN, USER
}
