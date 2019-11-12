// 예제 10.105 쿼리 타입에 생성된 결과

public class QItem extends EntitiPathBase<Item> {
    ...
    public com.mysema.query.types.expr.BooleanExpression
	isExpensive(Integer price) {
	return ItemExpression.isExpensive(this, price);
    }
}
