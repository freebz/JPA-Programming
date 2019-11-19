// 예제 12.16 스프링 데이터 JPA를 사용한 벌크성 수정 쿼리

@Modifying
@Query("update Product p set p.price = p.price * 1.1 where
    p.stockAmount < :stockAmount")
int bulkPriceUp(@Param("stockAmount") String stockAmount);
