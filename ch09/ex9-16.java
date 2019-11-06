// 예제 9.16 수정

Member member = em.find(Member.class, 1L);

//1. 임베디드 값 타입 수정
member.setHomeAddress(new Address("새로운도시", "신도시1", "123456"));

//2. 기본값 타입 컬렉션 수정
Set<String> favoriteFoods = member.getFavoriteFoods();
favoriteFoods.remove("탕수육");
favoriteFoods.add("치킨");

//3. 임베디드 값 타입 컬렉션 수정
List<Address> addressHistory = member.getAddressHistory();
addressHistory.remove(new Address("서울","기존 주소","123-123"));
addressHistory.add(new Address("새로운도시", "새로운 주소", "123-456"));
