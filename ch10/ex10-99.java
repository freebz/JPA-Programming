// 예제 10.99 필드 직접 접근

QItem item = QItem.item;
List<ItemDTO> result = query.from(item).list(
    Projections.fields(ItemDTO.class, item.name.as("username"),
        item.price));
