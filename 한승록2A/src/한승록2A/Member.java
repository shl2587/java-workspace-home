package 한승록2A;

public class Member {					// 1-1. 구매자와 판매자의 공통 성질인 이름과 아이디 패스워드를 private처리하여 선언
	private String name;
	private String userId, userPw;
	
	
	// 1-2. 해당 변수를 매개변수로 하는 생성자 생성
	// - 기본생성자는 Main클래스에서 멤버 클래스 인스턴스를 초기화 하기 위해 생성
	
	public Member() {};				 
	
	public Member(String name, String userId, String userPw) {		
		this.name = name;
		this.userId = userId;
		this.userPw = userPw;
	}
	

	// 1-3. 변수들이 private처리되어 있으므로 외부에서 사용하기 위한 getter/setter 생성
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
 	
}
