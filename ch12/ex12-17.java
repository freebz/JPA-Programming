// 예제 12.17 페이징과 정렬 사용 예제

//count 쿼리 사용
Page<Member> findByName(String name, Pageable pageable);

//count 쿼리 사용 안 함
List<Member> findByName(String name, Pageable pageable);

List<Member> findByName(String name, Sort sort);
