// 예제 10.4 QueryDSL 코드

//준비
JPAQuery query = new JPAQuery(em);
QMember member = QMember.member;

//쿼리, 결과조회
List<Member> members =
    query.from(member)
    .where(member.username.eq("kim"))
    .list(member);
