// 예제 4.13 시퀀스 사용 코드

private static void logic(EntityManager em) {
    Board board = new Board();
    em.persist(board);
    System.out.println("board.id = " + board.getId());
}
//출력: board.id = 1
