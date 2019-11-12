// 예제 10.6 하이버네이트 JDBC 획득

Sesstion session = entityManager.unwrap(Session.class);
session.doWork(new Work() {

    @Override
    public void execute(Connection connection) throws SQLException {
	//work...
    }
});
