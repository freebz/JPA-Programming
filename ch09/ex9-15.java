// 예제 9.15 조회

//SQL: SELECT ID, CITY, STREET, ZIPCODE FROM MEMBER WHERE ID = 1
Member member = em.find(Member.class, 1L); //1. member

//2. member.homeAddress
Address homeAddress = member.getHomeAddress();

//3. member.favoriteFoods
Set<String> favoriteFoods = member.getFavoriteFoods(); //LAZY

//SQL: SELECT MEMBER_ID, FOOD_NAME FROM FAVORITE_FOODS
//WHERE MEMBER_ID = 1
for (String favoriteFood : favoriteFoods) {
    System.out.println("favoriteFood = " + favoriteFood);
}

//4. member.addressHistory
List<Address> addressHistory = member.getAddressHistory(); //LAZY

//SQL: SELECT MEMBER_ID, CITY, STREET, ZIPCODE FROM ADDRESS
//WHERE MEMBER_ID = 1
addressHistory.get(0);
