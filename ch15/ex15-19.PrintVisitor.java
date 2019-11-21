// 예제 15.19 비지터 구현

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Book book) {
	//넘어오는 book은 Proxy가 아닌 원본 엔티티다.
	System.out.println("book.class = " + book.getClass());
	System.out.println("[PrintVisitor] [제목:" + book.getName() + " 저자:" + book.getAuthor() + "]");
    }

    @Override
    public void visit(Album album) {...}
    @Override
    public void visit(Movie movie) {...}
}

public class TitleVisitor implements Visitor {

    private String title;

    public String getTitle() {
	return title;
    }

    @Override
    public void visit(Book book) {
	title = "[제목:" + book.getName() + " 저자:" +
	    book.getAuthor() + "]";
    }

    @Override
    public void visit(Album album) {...}
    @Override
    public void visit(Movie movie) {...}
}
