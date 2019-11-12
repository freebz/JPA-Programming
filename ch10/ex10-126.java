// 예제 10.126 쿼리와 플러시 모드 예제

//가격을 1000->2000원으로 변경
product.setPrice(2000);

//가격이 2000원인 상품 조회
Product product2 =
    em.createQuery("select p from Product p where p.price = 2000",
	Product.class)
        .getSingleResult();
