// 예제 10.87 페이징과 정렬 listResults() 사용

SearchResults<Item> result =
    query.from(item)
        .where(item.price.gt(10000))
        .offset(10).limit(20)
        .listResults(item);

long total = result.getTotal(); //검색된 전체 데이터 수
long limit = result.getLimit();
long offset = result.getOffset();
List<Item> results = result.getResults(); //조회된 데이터
