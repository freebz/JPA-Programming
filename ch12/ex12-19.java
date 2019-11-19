// 예제 12.19 Page 사용 예제 실행 코드

//페이징 조건과 정렬 조건 설정
PageRequest pageRequest =
    new PageRequest(0, 10, new Sort(Direction.DESC, "name"));

Page<Member> result =
    memberRepository.findByNameStartingWith("김", pageRequest);

List<Member> members = result.getContent(); //조회된 데이터
int totalPages = result.getTotalPages(); //전체 페이지 수
boolean hasNextPage = result.hasNextPage(); //다음 페이지 존재 여부
