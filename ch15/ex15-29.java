// 예제 15.29 JPA 등록 배치 예제

EntityManager em = entityManagerFactory.createEntityManager();
EntityTransaction tx = em.getTransaction();
tx.begin();

for (int i = 0; i < 100000; i++) {
    Product product = new Product("item" + i, 1000);
    em.persist(product);

    //100건마다 플러시와 영속성 컨텍스트 초기화
    if ( i % 100 = 0 ) {
	em.flush();
	em.clear();
    }
}

tx.commit();
em.close();
