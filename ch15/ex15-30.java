// 예제 15.30 JPA 페이징 배치 처리 예제

EntityManager em = entityManagerFactory.createEntityManager();
EntityTransaction tx = em.getTransaction();

tx.begin();

int pageSize = 100;
for (int i = 0; i < 10; i++) {

    List<Product> resultList = em.createQuery("select p from Product p",
	Product.class)
	    .setFirstResult(i * pageSize)
	    .setMaxResults(pageSize)
 	    .getResultList();

    //비즈니스 로직 수행
    for (Product product : resultList) {
	product.setPrice(product.getPrice() + 100);
    }

    em.flush();
    em.clear();
}
tx.commit();
em.close();
