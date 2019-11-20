// 예제 14.24 JPQL에서 엔티티 그래프 힌트

List<Order> resultList =
    em.createQuery("select o from Order o where o.id = :orderId",
        Order.class)
        .setParameter("orderId", orderId)
        .setHint("javax.persistence.fetchgraph", em.getEntityGraph("Order.withAll"))
        .getResultList();
