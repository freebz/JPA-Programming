// 예제 10.94 서브 쿼리 예제 - 여러 건

QItem item = QItem.item;
QItem itemSub = new QItem("itemSub");

query.from(item)
    .where(item.in(
        new JPASubQuery().from(itemSub)
  	    .where(item.name.eq(itemSub.name))
	    .list(itemSub)
    ))
    .list(item);
