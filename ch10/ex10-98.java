// 예제 10.98 프로퍼티 접근(Setter)

QItem item = QItem.item;
List<ItemDTO> result = query.from(item).list(
    Projections.bean(ItemDTO.class, item.name.as("username"), item.price));
