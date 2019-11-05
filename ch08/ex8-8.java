// 예제 8.8 즉시 로딩 실행 코드

Member member = em.find(Member.class, "member1");
Team team = member.getTeam();  //객체 그래프 탐색
