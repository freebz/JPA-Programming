// 예제 10.127 플러시 모드 설정

em.setFlushMode(FlushModeType.COMMIT); //커밌 씨예만 플러씨

//가격을 1000->2000원으로 변경
product.setPrice(2000);

//1. em.flush() 직접 호출

//가격이 2000원인 상품 조회
Product product2 =
    em.createQuery("select p from Product p where p.price = 2000",
        Product.class)
        .setFlushMode(FlushModeType.AUTO) //2. setFlushMode() 설정
        .getSingleResult();
