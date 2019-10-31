// 예제 2.6 매핑 정보가 포함된 회원 클래스

package jpabook.start;

import javax.persistence.*;

@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String username;

    //매핑 정보가 없는 필드
    private Integer age;
    ...
}
