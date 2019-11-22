// 예제 16.23 쿼리 캐시 사용

public List<ParentMember> findParentMembers() {
    return em.createQuery("select p from ParentMember p join p.childMembers c", ParentMember.class)
	.setHint("org.hibernate.cacheable", true)
	.getResultList();
}
