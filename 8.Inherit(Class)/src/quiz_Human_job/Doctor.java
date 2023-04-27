package quiz_Human_job;

public class Doctor extends Human {

	// 객체 생성을 위해서는 부모 클래스(Human)의 생성자필요
	Doctor(String name, int age) {
		super(name, age);
	}
	
	
	@Override	// 어노테이션을 통해 오버라이딩 되었음을 주석으로 확인 및 문법 검사 진행
	public void introduce() {
		// Doctor 클래스 만의 내용을 가지고 있는 출력문 작성
		System.out.printf("%s의 나이는 %d세이며 직업은 의사입니다.\n", getName(), getAge());
	}
	
	// 의사 클래스에서만 사용가능한 heal메서드 작성
	public void heal() {
		System.out.printf("%s가 환자를 치료합니다.\n", getName());
	}

}
