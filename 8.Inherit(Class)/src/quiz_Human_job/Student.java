package quiz_Human_job;

public class Student extends Human {

	// 객체 생성을 위해서는 부모 클래스(Human)의 생성자필요
	Student(String name, int age) {
		super(name, age);
	}

	
	@Override	// 어노테이션을 통해 오버라이딩 되었음을 주석으로 확인 및 문법 검사 진행
	public void introduce() {
		// Student 클래스에서만 출력가능한 문구 작성
		System.out.printf("%s의 나이는 %d세이며 직업은 학생입니다.\n", getName(), getAge());
	}
}
