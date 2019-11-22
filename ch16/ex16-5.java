// 예제 16.5 OPTIMISTIC_FORCE_INCREMENT 예제

//트랜잭션 1 조회 title="제목A", version=1
Board board =
    em.find(Board.class, id, LockModeType.OPTIMISTIC_FORCE_INCREMENT);

//트랜잭션 1 커밋 시점에 버전 강제 증가
tx.commit();
