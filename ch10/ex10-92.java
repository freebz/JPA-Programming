// 예제 10.92 from 절에 여러 조건 사용

QOrder order = QOrder.order;
QMember member = QMember.member;

query.from(order, member)
    .where(order.member.eq(member))
    .list(order);
