// 예제 12.15 JPA를 사용한 벌크성 수정 쿼리

int bulkPriceUp(String stockAmount){
    ...
    String qlString =
	"update Product p set p.price = p.price * 1.1 where
            p.stockAmount < :stockAmount";

    int resultCount = em.createQuery(qlString)
	                .setParameter("stockAmount", stockAmount)
	                .executeUpdate();
}
