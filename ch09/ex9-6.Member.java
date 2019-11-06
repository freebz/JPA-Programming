// 예제 9.6 임베디드 타입과 연관관계

@Entity
public class Member {

    @Embedded Address address;          //임베디드 타입 포함
    @Embedded PhoneNumber phoneNumber;  //임베디드 타입 포함
    //...
}

@Embeddable
public class Address {
    String street;
    String city;
    String state;
    @Embedded Zipcode zipcode; //임베디드 타입 포함
}

@Embeddable
public class Zipcode {
    String zip;
    String plusFour;
}

@Embeddable
public class PhoneNumber {
    String areaCode;
    String localNumber;
    @ManyToOne PhoneServiceProvider provider; //엔티티 참조
    ...
}

@Entity
public class PhoneServiceProvider {
    @Id String name;
    ...
}
