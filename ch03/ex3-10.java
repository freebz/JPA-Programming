// 예제 3.10 영속성 컨텍스트 닫기

public void closeEntityManager() {

    EntityManagerFactory emf =
	Persistence.createEntityManagerFactory("jpabook");

    EntityManager em = emf.createEntityManager();
    EntityTransaction transaction = em.getTransaction();

    transaction.begin();  //[트랜잭션] - 시작

    Member memberA = em.find(Member.class, "memberA");
    Member memberB = em.find(Member.class, "memberB");

    transaction.commit();  //[트랜잭션] - 커밋

    em.close();  //영속성 컨텍스트 닫기(종료)
}
