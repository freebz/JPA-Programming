// 예제 8.17 CASCADE 저장 코드

private static void saveWithCascade(EntityManager em) {

    Child child1 = new Child();
    Child child2 = new Child();

    Parent parent = new Parent();
    child1.setParent(parent);   //연관관계 추가
    child2.setParent(parent);   //연관관계 추가
    parent.getChildren().add(child1);
    parent.getChildren().add(child2);

    //부모 저장, 연관된 자식들 저장
    em.persist(parent);
}
