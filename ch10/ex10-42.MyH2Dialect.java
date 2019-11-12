// 예제 10.42 방언 클래스 상속

public class MyH2Dialect extends H2Dialect {

    public MyH2Dialect() {
	registerFunction( "group_concat", new StandardSQLFunction
	    ("groupconcat",StandardBasicTypes.STRING));
    }
}
