// 예제 10.14 여러 프로젝션 엔티티 타입 조회

List<Object[]> resultList =
  em.createQuery("SELECT o.member, o.product, o.orderAmount FROM Order o")
    .getResultList();

for (Object[] row : resultList) {
    Member member = (Member) row[0];    //엔티티
    Product product = (Product) row[1]; //엔티티
    int orderAmount = (Integer) row[2]; //스칼라
}
