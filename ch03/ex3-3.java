// 예제 3.3 엔티티 수정

EntityManager em = emf.createEntityManager();
EntityTransaction transaction = em.getTransaction();
transaction.begin();  //[트랜잭션] 시작

//영속 엔티티 조회
Member memberA = em.find(Member.class, "memberA");

//영속 엔티티 데이터 수정
memberA.setUsername("hi");
memberA.setAge(10);

//em.update(member) 이런 코드가 있어야 하지 않을까?

transaction.commit(); //[트랜잭션] 커밋
