// 예제 12.46 QueryDslPredicateExecutor 인터페이스

public interface QueryDslPredicateExecutor<T> {

    T findOne(Predicate predicate);
    Iterable<T> findAll(Predicate predicate);
    Iterable<T> findAll(Predicate predicate,
        OrderSpecifier<?>... orders);
    Page<T> findAll(Prediate predicate, Pageable pageable);
    long count(Predicate predicate);
}
