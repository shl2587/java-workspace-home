package class_quiz_Human;

public class Human {
	
	// private 변수선언
	private static int population;	// main 함수에서 실행되야 하므로 static 변수로 선언	
	private String name;
	
	
	// 객체 생성 시 이름을 매개변수로 받는 생성자 생성
	Human(String name) {
		this.name = name;		// 이름을 입력받아 저장하고
		if (name != null) {		// 입력받는 데이터가 null이 아니면	
			Human.population++;	// population을 1 증가
								// - static 변수는 클래스 변수로 값을 저장
		}						
	}
	
	
	
	
	
	// private를 외부에서 사용하기 위한 getter, setter 생성
	public static int getPopulation() {	// static 변수의 getter는 static으로 생성
		return population;
	}

	public void setPopulation(int population) {
		Human.population = population;	// static 변수의 setter는 클래스.변수로 호출 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
