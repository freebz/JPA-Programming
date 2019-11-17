// 예제 11.37 OrderSearch

package jpabook.jpashop.domain;

public class OrderSearch {

    private String memberName;      //회원 이름
    private OrderStatus orderStauts;//주문 상태[ORDER, CANCEL]

    //Getter, Setter
    public String getmemberName() {return memberName;}
    public void setMemberName(String memberName) {
	this.memberName = memberName;}
    public OrderStatus getOrderStatus() {return orderStatus;}
    public void setOrderStatus(OrderStatus orderStatus)
        {this.orderStatus = orderStatus;}

}
