// 예제 10.83 QueryDSL 기본 쿼리 기능

JPAQuery query = new JPAQuery(em);
QItem item = QItem.item;
List<Item> list = query.from(item)
    .where(item.name.eq("좋은상품").and(item.price.gt(20000)))
    .list(item); //조회할 프로젝션 지정
