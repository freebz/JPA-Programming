// 예제 12.31 SimpleJpaRepository

@Repository
@Transactional(readOnly = true)
public class SimpleJpaRepository<T, ID extends Serializable> implements
JpaRepository<T, ID>,
    JpaSpecificationExecutor<T> {

    @Transactional
    public <S extends T> S save(S entity) {
	if (entityInformation.isNew(entity)) {
	    em.persist(entity);
	    return entity;
	} else {
	    return em.merge(entity);
	}
    }
    ...
}
