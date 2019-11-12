// 예제 10.55 숫자 타입 검색

//select m from Member m
//where m.age > 10 order by m.age desc

Root<Member> m = cq.from(Member.class);

//타입 정보 필요
Predicate ageGt = cb.greaterThan(m.<Integer>get("age"), 10);

cq.select(m);
cq.where(ageGt);
cq.orderBy(cb.desc(m.get("age")));
