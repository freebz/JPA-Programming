// 예제 2.5 회원 클래스

package jpabook.start;

public class Member {

    private String id;		//아이디
    private String username;	//이름
    private Integer age;	//나이

    //Getter, Setter
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getUsername() {return username;}
    public void setUsername(String username)
        {this.username = username;}

    public Integer getAge() {return age;}
    public void setAge(Integer age) {this.age = age;}
}
