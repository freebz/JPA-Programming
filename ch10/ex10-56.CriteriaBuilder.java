// 예제 10.56 CriteriaBuilder

public interface CriteriaBuilder {

    CriteriaQuery<Object> createQuery(); //조회값 반환 타입: Object

    //조회값 반환 타입: 엔티티, 임베디드 타입, 기타
    <T> CriteriaQuery<T> createQuery(Class<T> resultClass);

    CreateQuery<Tuple> createTupleQuery(); //조회값 반환 타입: Tuple
    ...
}
