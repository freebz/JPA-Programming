// 예제 8.16 부모 자식 저장

private static void saveNoCascade(EntityManager em) {

    //부모 저장
    Parent parent = new Parent();
    em.persist(parent);

    //1번 자식 저장
    Child child1 = new Child();
    child1.setParent(parent); //자식 -> 부모 연관관계 설정
    parent.getChildren().add(child1); //부모 -> 자식
    em.persist(child1);

    //2번 자식 저장
    Child child2 = new Child();
    child2.setParent(parent); //자식 -> 부모 연관관계 설정
    parent.getChildren().add(child2); //부모-> 자식
    em.persist(child2);
}
