// 예제 13.13 DTO로 반환

class MemberDTO {

    private String name;

    //Getter, Setter
}

...
MemberDTO memberDTO = new MemberDTO;
memberDTO.setName(member.getName());
return memberDTO;
