// 예제 6.18 역방향 탐색

public void findInverse() {

    Product product = em.find(Product.class, "productA");
    List<Member> members = product.getMembers();
    for (Member member : members) {
	System.out.println("member = " + member.getUsername());
    }
}
