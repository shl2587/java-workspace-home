package quiz_interface2;

public class Dog implements Animal{
	
	private String dogName;	// 강아지 이름을 저장하기 위한 dogName변수 작성
	
	Dog(String dogName) {	// 강아지 이름을 입력받기 위한 생성자 작성
		this.dogName = dogName;
	}

	// 오버라이딩 함수를 통한 private 처리된 dogName을 사용
	@Override
	public String getName() {
		return dogName;
	}
	

}
