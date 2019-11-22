// 예제 16.15 Cache 인터페이스

public interface Cache {

    //해당 엔티티가 캐시에 있는지 여부 확인
    public boolean contains(Class cls, Object primaryKey);

    //해당 엔티티중 특정 식별자를 가진 엔티티를 캐시에서 제거
    public void evict(Class cls, Object primaryKey);

    //해당 엔티티 전체를 캐시에서 제거
    public void evict(Class cls);

    //모든 캐시 데이터 제거
    public void evictAll();

    //JPA Cache 구현체 조회
    public <T> T unwrap(Class<T> cls);

}
