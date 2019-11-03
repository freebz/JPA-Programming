// 예제 6.22 회원상품 식별자 클래스

public class MemberProductId implements Serializable {

    private String member;  //MemberProduct.member와 연결
    private String product; //MemberProduct.product와 연결

    //hashCode and equals

    @Override
    public boolean equals(Object o) {...}

    @Override
    public int hashCode() {...}
}
