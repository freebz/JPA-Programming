// 예제 12.49 QueryDslRepositorySupport 코드

package org.springframework.data.jpa.repository.support;

@Repository
public abstract class QueryDslRepositorySupport {

    //엔티티 매니저 반환
    protected EntityManager getEntityManager() {
	return entityManager;
    }

    //from 절 반환
    protected JPQLQuery from(EntityPath<?>... paths) {
	return querydsl.createQuery(paths);
    }

    //QueryDSL delete 절 반환
    protected DeleteClause<JPADeleteClause> delete(EntityPath<?> path)
    {
	return new JPADeleteClause(entityManager, path);
    }

    //QueryDSL update 절 반환
    protected UpdateClause<JPAUpdateClause> update(EntityPath<?> path)
    {
	return new JPAUpdateClause(entityManager, path);
    }

    //스프링 데이터 JPA가 제공하는 Querydsl을 편하게 사용하도록 돕는
    //헬퍼 객체 반환
    protected Querydsl getQuerydsl() {
	return this.querydsl;
    }
}
