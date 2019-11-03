// 예제 6.24 조회 코드

public void find() {

    //기본 키 값 생성
    MemberProductId memberProductId = new MemberProductId();
    memberProductId.setMember("member1");
    memberProductId.setProduct("productA");

    MemberProduct memberProduct = em.find(MemberProduct.class,
	memberProductId);

    Member member = memberProduct.getMember();
    Product product = memberProduct.getProduct();

    System.out.println("member = " + member.getUsername());
    System.out.println("product = " + product.getName());
    System.out.println("orderAmount = " +
        memberProduct.getOrderAmount());
}
