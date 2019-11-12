// 예제 10.63 Criteria construct()

//JPQL: select new jpabook.domain.MemberDTO(m.username, m.age)
//from Member m

CriteriaQuery<MemberDTO> cq = cb.createQuery(MemberDTO.class);
Root<Member> m = cq.from(Member.class);

cq.select(cb.construct(MemberDTO.class, m.get("username"),
    m.get("age")));

TypedQuery<MemberDTO> query = em.createQuery(cq);
List<MemberDTO> resultList = query.getResultList();
