// 예제 14.6 사용 코드

Board board = new Board("제목1","내용1");
em.persist(board);

Comment comment1 = new Comment("댓글1");
comment1.setBoard(board);
board.getComments().add(comment1); //POSITION 0
em.persist(comment1);

Comment comment2 = new Comment("댓글2");
comment2.setBoard(board);
board.getComments().add(comment2); //POSITION 1
em.persist(comment2);

Comment comment3 = new Comment("댓글3");
comment3.setBoard(board);
board.getComments().add(comment3); //POSITION 2
em.persist(comment3);

Comment comment4 = new Comment("댓글4");
comment4.setBoard(board);
board.getComments().add(comment4); //POSITION 3
em.persist(Comment4);
