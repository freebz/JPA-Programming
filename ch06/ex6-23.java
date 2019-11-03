// 예제 6.23 저장하는 코드

public void save() {

    //회원 저장
    Member member1 = new Member();
    member1.setId("member1");
    member1.setUsername("회원1");
    em.persist(member1);

    //상품 저장
    Product productA = new Product();
    productA.setId("productA");
    productA.setName("상품1");
    em.persist(productA);

    //회원상품 저장
    MemberProduct memberProduct = new MemberProduct();
    memberProduct.setMember(member1);   //주문 회원 - 연관관계 설정
    memberProduct.setProduct(productA); //주문 상품 - 연관관계 설정
    memberProduct.setOrderAmount(2);    //주문 수량

    em.persist(memberProduct);
}
