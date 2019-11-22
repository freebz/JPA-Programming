// 예제 16.14 Cache 관리 객체 조회

Cache cache = emf.getCache();
boolean contains =
    cache.contains(TestEntity.class, testEntity.getId());
System.out.println("contains = " + contains);
