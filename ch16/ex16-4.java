// 예제 16.4 OPTIMISTIC 예제

//트랜잭션 1 조회 title="제목A", version=1
Board board = em.find(Board.class, id, LockModeType.OPTIMISTIC);

//중간에 트랜잭션 2에서 해당 게시물을 수정해서 title="제목C", version=2로 증가

//트랜잭션 1 커밋 시점에 버전 정보 검증, 예외 발생
// (데이터베이스 version=2, 엔티티 version=1)
tx.commit();
