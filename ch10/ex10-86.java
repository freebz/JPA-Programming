// 예제 10.86 페이징과 정렬 QueryModifiers 사용

QueryModifiers queryModifiers = new QueryModifiers(20L, 10L); //Limit, offset
List<Item> list =
    query.from(item)
    .restrict(queryModifiers)
    .list(item);
