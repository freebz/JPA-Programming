// 예제 1.13 지연 로딩 사용

//처음 조회 시점에 SELECT MEMBER SQL
Member member = jpa.find(Member.class, memberId);

Order order = member.getOrder();
order.getOrderDate(); //Order를 사용하는 시점에 SELECT ORDER SQL
