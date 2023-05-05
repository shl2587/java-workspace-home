package quiz_interface2;

public class Human implements Animal{
	
	private String humanName;	// 사람이름을 저장받기 위한 manName 선언
	private String feed;	// 애완동물에게 줄 먹이를 저장받기 위한 feed변수 선언
	
	
	Human(String humanName) {		// main함수에서 사용할 객체 생성을 위한 생성자 선언
		this.humanName = humanName;
	}
	
	public String give(Animal name) {	// 출력할 내용을 담을 give함수 작성
		if (name instanceof Dog) {		// instanceof로 객체 타입 확인하여 Dog클래스 객체이면
			feed = "개껌";				// feed에 개껌을 저장하고
			// 강아지 주인 이름과 강아지 이름, 개껌을 넣을 format메서드 반환 
			return String.format("%s(이)가 %s에게 %s(을)를 줍니다\n", humanName, ((Dog)name).getName(), feed);
		}
		
		if (name instanceof Cat) {		// instanceof로 객체 타입 확인하여 Cat클래스 객체이면
			feed = "츄르";				// feed에 츄르를 저장하고
			// 고양이 주인 이름과 고양이 이름, 츄르를 넣을 format메서드 반환
			return String.format("%s(이)가 %s에게 %s(을)를 줍니다\n", humanName, ((Cat)name).getName(), feed);
		}
		
		else {	// 모두가 아니면 null을 반환
			return null;
		}

	}
	
	
	
	// private 처리된 사람이름을 사용하기 위해
	// 오버라이딩을 통한 getName 작성 
	@Override
	public String getName() {
		return humanName;
	}


	
}
