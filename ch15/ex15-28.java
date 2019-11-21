// 예제 15.28 읽기 전용 트랜잭션과 읽기 전용 쿼리 힌트 적용

@Transactional(readOnly = true)
public List<DataEntity> findDatas() {

    return em.createQuery("select d from DataEntity d",
	DataEntity.class)
	.setHint("org.hibernate.readOnly", true)
	.getResultList();
}
