// 예제 6.7 일대다 단방향 매핑의 단점

public void testSave() {
    
    Member member1 = new Member("member1");
    Member member2 = new Member("member2");

    Team team1 = new Team("team1");
    team1.getMembers().add(member1);
    team1.getMembers().add(member2);

    em.persist(member1);//INSERT-member1
    em.persist(member2);//INSERT-member2
    em.persist(team1);  //INSERT-team1, UPDATE-member1.fk,
                        //UPDATE-member2.fk
    transaction.commit();    
}
