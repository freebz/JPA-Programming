// 예제 9.20 회원(Member)에 값 타입 적용

package jpabook.model.entity;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    //private String city;        //삭제
    //private String street;      //삭제
    //private String zipcode;     //삭제

    @Embedded                     //추가
    private Address address;      //추가

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();
    ...
}
