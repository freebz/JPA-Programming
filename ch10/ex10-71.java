// 예제 10.71 CASE 식 사용 예

/* JPQL
    select m.username,
        case when m.age>=60 then 600
	     when m.age<=15 then 500
	     else 1000
	 end
     from Member m
*/

Root<Member> m = cq.createQuery(Member.class);

cq.multiselect(
    m.get("username"),
    cb.selectCase()
        .when(cb.ge(m.<Integer>get("age"), 60), 600)
        .when(cb.le(m.<Integer>get("age"), 15), 500)
        .otherwise(1000)
);
