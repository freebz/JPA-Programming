// 예제 9.11 불변 객체 사용

Address address = member1.getHomeAddress();
//회원1의 주소값을 조회해서 새로운 주소값을 생성
Address newAddress = new Address(address.getCity());
member2.setHomeAddress(newAddress);
