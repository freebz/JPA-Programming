// 예제 10.91 페치 조인 사용

query.from(order)
    .innerJoin(order.member, member).fetch()
    .leftJoin(order.orderItems, orderItem).fetch()
    .list(order);
