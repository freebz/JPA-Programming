// 예제 2.8 시작 코드

package jpabook.start;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

	//[엔티티 매니저 팩토리] - 생성
	EntityManagerFactory emf =
	    Persistence.createEntityManagerFactory("jpabook");
	//[엔티티 매니저] - 생성
	EntityManager em = emf.createEntityManager();
	//[트랜잭션] - 획득
	EntityTransaction tx = em.getTransaction();

	try {

	    tx.begin();    //[트랜잭션] - 시작
	    logic(em);     //비즈니스 로직 실행
	    tx.commit();    //[트랜잭션] - 커밋

	} catch (Exception e) {
	    tx.rollback();  //[트랜잭션] - 롤백
	} finally {
	    em.close();     //[엔티티 매니저] - 종료
	}
	emf.close();	    //[엔티티 매니저 팩토리] - 종료
    }

    //비즈니스 로직
    private static void logic(EntityManager em) {...}
}
