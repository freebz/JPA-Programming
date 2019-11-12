// 예제 10.51 @NamedQeury 어노테이션

@Target({TYPE})
public @interface NamedQuery {

    String name();  //Named 쿼리 이름 (필수)
    String query();  //JPQL 정의 (필수)
    LockModeType lockMode() default NONE; //쿼리 실행 시 락모드를
    					  //설정할 수 있다.
    QueryHint[] hints() default {}; //JPA 구현체에 쿼리 힌트를 줄 수 있다.
}
