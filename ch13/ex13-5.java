// 예제 13.5 프리젠테이션 로직

Order order = orderService.findOne(orderId);
Member member = order.getMember();
member.getName(); //이미 로딩된 엔티티
