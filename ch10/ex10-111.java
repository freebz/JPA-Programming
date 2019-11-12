// 예제 10.111 표준 명세 예제 - 매핑 정보

@SqlResultSetMapping(name="OrderResults",
    entities={
      @EntityResult(entityClass=com.acme.Order.class, fields={
	  @FieldResult(name="id", column="order_id"),
	  @FieldResult(name="quantity", colunm="order_quantity"),
	  @FieldResult(name="item", column="order_item")})},
    columns={
        @ColumnResul(name="item_name")}
)
