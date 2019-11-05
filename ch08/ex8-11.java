// 예제 8.11 지연 로딩 실행 코드

Member member = em.find(Member.class, "member1");
Team team = member.getTeam();  //객체 그래프 탐색
team.getName(); //팀 객체 실제 사용
