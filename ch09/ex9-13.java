// 예제 9.13 값 타입 컬렉션 등록

Member member = new Member();

//임베디드 값 타입
member.setHomeAddress(new Address("통영","몽돌해수욕장","660-123"));

//기본값 타입 컬렉션
member.getFavoriteFoods().add("짬뽕");
member.getFavoriteFoods().add("짜장");
member.getFavoriteFoods().add("탕수육");

//임베디드 값 타입 컬렉션
member.getAddressHistory().add(new Address("서울","강남","123-123"));
member.getAddressHistory().add(new Address("서울","강북","000-000"));

em.persist(member);
