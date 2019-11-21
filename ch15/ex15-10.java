// 예제 15.10 프록시 동등성 비교 예제, 수정

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Member)) return false;

    Member member = (Member) obj;

    if (name != null ? !name.equals(member.name) :
	member.getName() != null)
	return false;
    
    return true;
}
