// 예제 10.124 DELETE 벌크 연산

String qlString =
    "delete from Product p " +
    "where p.price < :price";

int resultCount = em.createQuery(qlString)
                    .setParameter("price", 100)
                    .executeUpdate();
