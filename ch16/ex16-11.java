// 예제 16.11 엔티티 매니저 범위

em.setProperty("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS);
em.setProperty("javax.persistence.cache.storeMode", CacheStoreMode.BYPASS);
