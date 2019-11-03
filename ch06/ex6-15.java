// 예제 6.15 저장

public void save() {

    Product productA = new Product();
    productA.setId("productA");
    productA.setName("상품A");
    em.persist(productA);

    Member member1 = new Member();
    member1.setId("member1");
    member1.setUsername("회원1");
    member1.getProducts().add(productA); //연관관계 설정
    em.persist(member1);

}
