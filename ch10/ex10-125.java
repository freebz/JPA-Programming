// 예제 10.125 벌크 연산 시 주의점 예제

//상품A 조회(상품A의 가격은 1000원이다.)
Product productA =
    em.createQuery("select p from Product p where p.name = :name",
	Product.class)
        .setParameter("name", "productA")
        .setSingleResult();

//출력 결과: 1000
System.out.println("productA 수정 전 = " + productA.getPrice());

//벌크 연산 수행으로 모든 상품 가격 10% 상승
em.createQuery("update Product p set p.price = p.price * 1.1")
    .executeUpdate();

//출력 결과: 1000
System.out.println("productA 수정 후 = " + productA.getPrice());
