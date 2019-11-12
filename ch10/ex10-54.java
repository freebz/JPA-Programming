// 예제 10.54 검색 조건 추가

//JPQL
//select m from Member m
//where m.username='회원1'
//order by m.age desc

CriteriaBuilder cb = em.getCriteriaBuilder();

CriteriaQuery cq = cb.createQuery(Member.class);

Root<Member> m = cq.from(Member.class); //FROM 절 생성

//검색 조건 정의
Predicate usernameEqual = cb.equal(m.get("username"), "회원1");

//정렬 조건 정의
javax.persistence.criteria.Order ageDesc = cb.desc(m.get("age"));

//쿼리 생성
cq.select(m)
    .where(usernameEqual) //WHERE 절 생성
    .orderBy(ageDesc); //ORDER BY 절 생성

List<Member> resultList = em.createQuery(cq).getResultList();
