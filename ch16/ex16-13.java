// 예제 16.13 JPQL

em.createQuery("select e from TestEntity e where e.id = :id",
    TestEntity.class)
    .setParameter("id", id)
    .setHint("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS)
    .setHint("javax.persistence.cache.storeMode", CacheStoreMode.BYPASS)
    .getSingleResult();
