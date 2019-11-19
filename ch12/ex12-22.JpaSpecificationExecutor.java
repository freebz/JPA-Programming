// 예제 12.22 JpaSpecificationExecutor 인터페이스

public interface JpaSpecificationExecutor<T> {

    T findOne(Specification<T> spec);
    List<T> findAll(Specification<T> spec);
    Page<T> findAll(Specification<T> spec, Pageable pageable);
    List<T> findAll(Specification<T> spec, Sort sort);
    long count(Specification<T> spec);
}
