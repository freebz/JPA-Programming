// 예제 15.22 비지터 구현 예제

public class PrintVisitor implements Visitor {

    public void visit(Book book) {
	//넘어오는 book은 Proxy가 아닌 원본 엔티티다.
	System.out.println("book.class = " + book.getClass());
	Symets.out.println("[PrintVisitor] [제목:" + book.getName() +
	    " 저자:" + book.getAuthor() + "]");
    }
    public void visit(Album album) {...}
    public void visit(Movie movie) {...}
}
