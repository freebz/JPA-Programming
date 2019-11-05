// 예제 8.5 프록시 초기화 예제

//MemberProxy 반환
Member member = em.getReference(Member.class, "id1");
member.getName(); //1. getName();
