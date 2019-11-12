// 예제 10.97 예제 ItemDTO

public class ItemDTO {

    private String username;
    private int price;

    public ItemDTO() {}

    public ItemDTO(String username, int price) {
	this.username = username;
	this.price = price;
    }

    //Getter, Setter
    public String getUsername() {...}
    public void setUsername(String username) {...}
    public int getPrice() {...}
    public void setPrice(int price) {...}
}
