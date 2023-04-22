package 한승록2A;

public class Seller extends Member{		// 3-1. Member 클래스를 extends로 상속
	private String storeName;			// 3-2. Seller만의 단독 성질인 가게 이름을 private String storeName로 선언
	
	
	// 3-3. 상속받은 Member 클래스의 변수를 공유하는 super(매개변수)를 포함한 생성자 생성
	// - 개별 속성인 storeName은  this.storeName을 통해 값을 저장
	public Seller(String name, String userId, String userPw, String storeName) {
		super(name, userId, userPw);
		this.storeName = storeName;
	}
	
	
	// 3-5. Object가 Member에 기본으로 상속하고 있으며 그것을 다시 상속받은 Seller에 오버라이딩
	// - 전체 목록과 개별 검색에 출력해주기 위해 생성
    // - Seller.class.getSimpleName()으로 구매자인지 판매자인지 구분
    // - password는 개인 정보이므로 "********"으로 출력되도록 고정
	@Override
	public String toString() {
		return String.format("[%s] 회원정보\n"
				+ "ID : %s\n"
				+ "PW : *********\n"
				+ "이름 : %s\n"
				+ "가게 이름 : %s\n",
				Seller.class.getSimpleName(), super.getUserId(), super.getName(), storeName);
	}
	
	
	// 3-4. private 처리된 storeName에 대한 getter / setter 생성
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	
	
	
	
}
