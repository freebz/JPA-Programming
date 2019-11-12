// 예제 10.101 수정 배치 쿼리

QItem item = QItem.item;
JPAUpdateClause updateClause = new JPAUpdateClause(em, item);
long count = updateClause.where(item.name.eq("시골개발자의 JPA 책"))
    .set(item.price, item.price.add(100))
    .execute();
