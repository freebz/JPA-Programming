// 예제 7.13 일대일 식별 관계 저장

public void save() {
    Board board = new Board();
    board.setTitle("제목");
    em.persist(board);

    BoardDetail boardDetail = new BoardDetail();
    boardDetail.setContent("내용");
    boardDetail.setBoard(board);
    em.persist(boardDetail);
}
