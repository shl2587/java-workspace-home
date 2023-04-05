package 한승록2A;

public class Customer extends Member{	// 2-1. 공통 속성이 저장된 Member 클래스를 extends로 상속 받음
	private String address;				// 2-2. Customer클래스만의 속성인 address를 문자열 선언하고 private 처리 

	
	// 2-3. 상속받은 Member 클래스의 변수를 공유하는 super(매개변수)를 포함한 생성자 생성
	// - super에 포함된 매개변수를 제외한 address를 this.address로 값을 저장
	public Customer(String name, String userId, String userPw, String address) {	
		super(name, userId, userPw);
		this.address = address;
	}

	// 2-5. Object가 Member에 디폴드 값으로 상속하고 있으므로 그것을 다시 상속받은 Cunstomer에 오버라이딩
	// - 전체 목록과 개별 검색에 출력해주기 위해 생성
	// - Customer.class.getSimpleName()으로 구매자 클래스인지 판매자 클래스인지 구분
	// - password는 개인정보 이므로 "********"로 출력되도록 고정
	@Override
	public String toString() {
		return String.format("[%s] 회원정보\n"
				+ "ID : %s\n"
				+ "PW : *********\n"
				+ "이름 : %s\n"
				+ "가게 이름 : %s\n",
				Customer.class.getSimpleName(), super.getUserId(), super.getName(), address);
	}
	
	// 2-4. private 처리된 address 변수의 getter/setter 생성
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
