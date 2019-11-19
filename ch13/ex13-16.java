// 예제 13.16 비즈니스 로직을 먼저 수행 예제

memberService.biz(); //비즈니스 로직 먼저 실행

Member member = memberSerivce.getMember(id);
member.setName("xxxx"); //마지막에 엔티티를 수정한다.
