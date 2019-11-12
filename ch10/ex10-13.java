// 예제 10.13 여러 프로젝션 Object[]로 조회

List<Object[]> resultList =
    em.createQuery("SELECT m.username, m.age FROM Member m")
      .getResultList();

for (Object[] row : resultList) {
    String username = (String) row[0];
    Integer age = (Integer) row[1];
}
