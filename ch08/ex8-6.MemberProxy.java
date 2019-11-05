// 예제 8.6 프록시 클래스 예상 코드

class MemberProxy extends Member {

    Member target = null; //실제 엔티티 참조

    public String getName() {

	if(target == null) {

	    //2. 초기화 요칭
	    //3. DB 조회
	    //4. 실제 엔티티 생성 및 참조 보관
	    this.target = ...;
	}

	//5. target.getName();
	return target.getName();
    }
}
