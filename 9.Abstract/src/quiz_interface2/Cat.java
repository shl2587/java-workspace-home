package quiz_interface2;

public class Cat implements Animal{
	
	private String catName;	// 고양이 이름을 저장하기 위한 catName변수 선언
	
	Cat(String catName) {	// 고양이 이름을 입력받기 위한 생성자 작성
		this.catName = catName;
	}

	// 오버라이딩 함수를 통한 private 처리된 catName을 사용
	@Override
	public String getName() {
		return catName;
	}

}
