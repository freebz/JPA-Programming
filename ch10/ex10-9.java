// 예제 10.9 Query 사용

Query query =
    em.createQuery("SELECT m.username, m.age from Member m");
List resultList = query.getResultList();

for (Object o : resultList) {
    Object[] result = (Object[]) o; //결과가 둘 이상이면 Object[] 반환
    System.out.println("username = " + result[0]);
    System.out.println("age = " + result[1]);
}
