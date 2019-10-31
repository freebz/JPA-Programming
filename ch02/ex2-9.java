// 예제 2.9 트랜젝션 코드 부분

EntityTransaction tx = em.getTransaction(); //트랜젝션API
try {

    tx.begin();  //트랜젝션 시작
    logic(em);   //비즈니스 로직 실행
    tx.commit(); //트랜잭션 커밋

} catch (Exception e) {
    tx.rollback(); //예외 발생 시 트랜잭션 롤백
}
