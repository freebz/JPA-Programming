// 예제 2.10 비즈니스 로직 코드

public static void logic(EntityManager em) {

    String id = "id1";
    Member member = new Member();
    member.setId(id);
    member.setUsername("지한");
    member.setAge(2);

    //등록
    em.persist(member);

    //수정
    member.setAge(20);

    //한 건 조회
    Member findMember = em.find(Member.class, id);
    System.out.println("findMember=" + findMember.getUsername()
	+ ", age=" + findMember.getAge());

    //목록 조회
    List<Member> members =
	em.createQuery("select m from Member m", Member.class)
	  .getResultList();
    System.out.println("members.size=" + members.size());

    //삭제
    em.remove(member);
}
