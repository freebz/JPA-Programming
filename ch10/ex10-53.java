// 예제 10.53 Criteria 쿼리 시작

//JPQL: select m from Member m

CriteriaBuilder cb = em.getCriteriaBuilder(); //Criteria 쿼리 빌더

//Criteria 생성, 반환 타입 지정
CriteriaQuery<Member> cq = cb.createQuery(Member.class);

Root<Member> m = cq.from(Member.class); //FROM 절
cq.select(m); //SELECT 절

TypedQuery<Member> query = em.createQuery(cq);
List<Member> members = query.getResultList();
