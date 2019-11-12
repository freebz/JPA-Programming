// 예제 10.88 groupBy() 사용

query.from(item)
    .groupBy(item.price)
    .having(item.price.gt(1000))
    .list(item);
