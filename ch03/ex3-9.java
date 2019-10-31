// 예제 3.9 영속성 컨텍스트 초기화

//엔티티 조회, 영속 상태
Member member = em.find(Member.class, "memberA");

em.clear(); //영속성 컨텍스트 초기화

//준영속 상태
member.setUsername("changeName");
