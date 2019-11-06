// 예제 9.4 기간 임베디드 타입

@Embeddable
public class Period {

    @Temporal(TemporalType.DATE) java.util.Date startDate;
    @Temporal(TemporalType.DATE) java.util.Date endDate;
    //..

    public boolean isWork(Date date) {
	//.. 값 타입을 위한 메소드를 저의할 수 있다.
    }
}
