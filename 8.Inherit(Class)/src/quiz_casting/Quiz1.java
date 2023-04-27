package quiz_casting;

class Human {					// 슈퍼클래스
	private String name;
	private int age;
	
	public Human(String name, int age) {	// 이름과 나이를 매개변수로 입력받을
											// Human 생성자 작성
		this.name = name;					// 필드 변수 name에 이름을 저장
		this.age = age;						// 필드 변수 age에 나이를 저장
	}
	
	public void show() {					// 자기소개를 위한 내부 메서드 작성
		System.out.printf("이름은 %s이고, 나이는 %d살입니다\n", name, age);
	}
	
	// private 처리된 변수를 사용하기 위해 getter 작성
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

class Doctor extends Human {	// 의사
	private String major;	// 의사를 판별하기 위한 전공을 저장할 major 선언
	
	
	public Doctor(String name, int age, String major) {
		super(name, age);		// 상속받은 Human의 생성자 호출
		this.major = major;		// 필드변수에 전공 입력
	}
	
	@Override	// 슈퍼클래스의 메서드 오버라이딩
	public void show() {	
		// 출력문을 변경하여 오버라이딩 적용되는 것을 확인
		System.out.printf("%s의사 %s이고, 나이는 %d살입니다\n", major, getName(), getAge());
	}
	
	// 의사 고유의 heal()메서드 작성
	public void heal(Human target) {	// 업캐스팅을 위한 매개변수를 Human자료형으로 선언
		System.out.println(target.getName() + " 환자를 치료합니다");
		// private 처리되어 있는 슈퍼객체의 name변수를 getter를 활용하여 호출
	}
}

class Student extends Human {	// 학생
	private int score;	// 학생을 구분하기 위한 점수를 저장할 score변수 선언

	
	public Student(String name, int age, int score) {
		super(name, age);	// 슈퍼클래스 생성자 호출
		this.score = score;	// Student 고유의 필드 변수에 값을 저장
	}
	
	@Override
	public void show() {
		// 오버라이딩 됨을 확인하기 위하여 점수를 포함하는 변경된 출력문 작성
		System.out.printf("학생 %s이고, 나이는 %d살, 점수는 %d점입니다\n", getName(), getAge(), score);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		
		// 문제 >> 의사로 학생 치료하기
		// - 상속받은 서로 다른 서브 클래스를 업캐스팅 하여 상호작용 
		
		// 의사도 사람이고, 학생도 사람이므로, 의사 객체와 학생 객체는 사람 클래스로 처리할 수 있다
		// 슈퍼클래스의 변수로 서브클래스의 객체를 저장할 수 있다
		
		
		Doctor ob1 = new Doctor("김사부", 42, "흉부외과");
		ob1.show();	// 슈퍼클래스의 메서드를 상속받은 후, 형식을 유지하면서 내용을 재정의한 오버라이딩 메서드
		
		Student ob2 = new Student("김철수", 24, 100);
		ob2.show();	// 물려받은 내용을 덮어쓴 오버라이딩 메서드
		
		ob1.heal(ob2);
		// 서브클래스 객체는 슈퍼클래스 타입으로 참조할 수 있다
		
		Human ref1 = ob1;	// 의사는 사람이다
		Human ref2 = ob2;	// 학생은 사람이다
		
	}
}
