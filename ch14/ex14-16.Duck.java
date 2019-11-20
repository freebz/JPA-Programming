// 예제 14.16 별도의 리스너 사용

@Entity
@EntityListener(DuckListener.class)
public class Duck {
    ...
}

public class DuckListener {

    @PrePersist
    //특정 타입이 확실하면 특정 타입을 받을 수 있다.
    private void prePersist(Object obj) {
	System.out.println("DuckListener.prePersist obj = [" + obj + "]");
    }

    @PostPersist
    //특정 타입이 확실하면 특정 타입을 받을 수 있다.
    private void postPersist(Object obj) {
	System.out.println("DuckListener.postPersist obj = [" + obj + "]");
    }
}
