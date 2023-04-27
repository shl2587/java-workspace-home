package quiz_Human_job;

import java.util.Scanner;

// 상속관계를 나타내기 위한 두 클래스는 개념적으로 포함관계에 있다
// - 구조적인 포함관계가 아님을 주의
// 1) 의사는 사람이다(O)		의사는 사람 카테고리에 포함된다
// 2) 타이어는 자동차다(X)		타이어는 구조적으로 자도차 부품에 포함되나, 그 자체가 자동차는 아니다

// 서브클래스의 객체는 슈퍼클래스로 대체될 수 있어야 한다
// 의사는 사람에 해당하는 다른 클래스의 인스턴스로 대체될 수 있어야 한다

// 옆집 의사 선생님 -> 옆집 학생
// 우리집 자동차를 타고 이동한다 -> 우리집 타이어를 타고 이동한다(?)

// 의사도 사람이고, 학생도 사람이므로, 의사 객체와 학생 객체는 사람 클래스로 처리할 수 있다
// 서브클래스의 객체를 슈퍼클래스 타입으로 형변환 할 수 있다
// 슈퍼클래스의 변수로 서브클래스의 객체를 저장할 수 있다

// 만약, 각 서브클래스에서 오버라이딩된 메서드가 있다면
// 타입을 슈퍼클래스로 참조하고 있더라도, 서브클래스이 오버라이딩 메서드가 호출된다

public class Quiz1 {
	public static void main(String[] args) {
		
	// 문제 >> 
	// 위의 개념을 활용하여 철수가 의사가 직업을 수행 할때만 치료할 수 있고 업무시간이 아닐때는 일반인으로 취급하여
	// 치료할 수 없도록 객체 생성
	
	Scanner sc = new Scanner(System.in);
	
	String doc;		// 철수의 이름을 입력받을 doc 변수 선언
	int d_age;		// 철수의 나이 입력받을 변수 d_age 선언
	
	String stu;		// 치료 가능여부 비교를 위한 학생의 이름을 입력받을 stu 변수 선언
	int s_age;		// 학생의 나이 입력	s_age 선언
	
	
	System.out.print("의사 이름 입력 : ");
	doc = sc.nextLine();
	System.out.print("의사의 나이 입력 : ");
	d_age = Integer.parseInt(sc.nextLine());
	System.out.println();
	
	System.out.print("학생 이름 입력 : ");
	stu = sc.nextLine();
	System.out.print("학생의 나이 입력 : ");
	s_age = Integer.parseInt(sc.nextLine());
	System.out.println();
			
	// 부모 클래스인 Human 클래스로 각각 객체 생성하여 부모클래스의 메서드 작동여부 확인
	Human doctor = new Human(doc, d_age);
	Human student = new Human(stu, s_age);
	
	Human d = new Doctor(doc, d_age);
	doctor.introduce();
	student.introduce();
	System.out.println();
	
	// 자식 클래스 Doctor와 Student에 각각의 이름과 나이를 전달하여 상속되었는지 확인
	Doctor dc = new Doctor(doc, d_age);
	Student st = new Student(stu, s_age);
	
	// 상속이 되었다면 같은 메서드 명이라도 각각의 변경된 구문 출력
	dc.introduce();
	st.introduce();
	
	// 의사인 상태에서만 치료가능함을 확인
	dc.heal();
	System.out.println();
	
//	doctor.heal();		// 해당 객체는 의사가 아니기때문에 실행이 안됨을 확인
	
	
	sc.close();
	}
}
