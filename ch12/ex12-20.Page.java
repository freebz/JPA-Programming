// 예제 12.20 Page 인터페이스

public interface Page<T> extends Iterable<T> {

    int getNumber();            //현재 페이지
    int getSize();		//페이지 크기
    int getTotalPages();	//전체 페이지 수
    int getNumberOfElements();	//현재 페이지에 나올 데이터 수
    long getTotalElements();	//전체 데이터 수
    boolean hasPreviousPage();	//이전 페이지 여부
    boolean isFirstPage();	//현재 페이지가 첫 페이지 인지 여부
    boolean hasNextPage();	//다음 페이지 여부
    boolean isLastPage();	//현재 페이지가 마지막 페이지 인지 여부
    Pageable nextPageable();	//다음 페이지 객체, 다음 페이지가 없으면 null
    Pageable previousPageable();//이전 페이지 객체, 이전 페이지가 없으면 null
    List<T> getContent();	//조회된 데이터
    boolean hasContent();	//조회된 데이터 존재 여부
    Sort getSort();		//정렬 정보
}
