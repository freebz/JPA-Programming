// 예제 16.2 버전 관리 사용 예제

//트랜잭션 1 조회 title="제목A", version=1
Board board = em.find(Board.class, id);

//트랜잭션 2에서 해당 게시물을 수정해서 title="제목C", version=2로 증가

board.setTitle("제목B"); //트랜잭션 1 데이터 수정

save(board);
tx.commit(); //예외 발생, 데이터베이스 version=2, 엔티티 version=1
