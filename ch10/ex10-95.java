// 예제 10.95 프로젝션 대상이 하나

QItem item = QItem.item;
List<String> result = query.from(item).list(item.name);

for (String name : result) {
    System.out.println("name = " + name);
}
