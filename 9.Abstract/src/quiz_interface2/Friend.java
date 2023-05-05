package quiz_interface2;

public class Friend extends Human{

	// main에서 사용할 Friend객체를 사용하기 위한 생성자 작성
	Friend(String friendName) {	
		super(friendName);
	}

	
	// 오버라이딩 된 give함수를 통해
	// format메서드를 사용
	@Override
	public String give(Animal name) {
		return super.give(name);
	}
	
	
	// 부모 클래스인 Human이 상속받은 getName을 상속받아 사용
	@Override
	public String getName() {
		return super.getName();	
	}

}
