// 예제 6.27 저장 코드

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

    //주문 저장
    Order order = new Order();
    order.setMember(member1);   //주문 회원 - 연관관계 설정
    order.setProduct(productA); //주문 상품 - 연관관계 설정
    order.setOrderAmount(2);    //주문 수량
    em.persist(order);
}
