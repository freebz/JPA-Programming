// 예제 6.16 탐색

public void find() {

    Member member = em.find(Member.class, "member1");
    List<Product> products = member.getProducts(); //객체 그래프 탐색
    for (Product product : products) {
	System.out.println("product.name = " + product.getName());
    }
}
