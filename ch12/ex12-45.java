// 예제 12.45 QueryDSL 사용 예제

QItem item = QItem.item;
Iterable<Item> result = itemRepository.findAll(
    item.name.contains("장난감").and(item.price.between(10000, 20000))
);
