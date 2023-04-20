package quiz;

import java.util.Scanner;

class Student {
	// 학생의 이름과
	// 국어, 영어, 수학 성적
	// 합계 점수와 평균 점수를 저장하기 위한 필드를 작성합니다
	String name;
	int kor, eng, math;
	int total;
	double avg;

	// 학생 객체를 생성하기 위한 생성자를 작성합니다
	// 단, 학생 객체는 이름과 세 과목의 점수를 반드시 입력해야만 생성할 수 있으며
	// 합계와 평균은 전달받지 않고, 생성자에서 계산하여 필드의 값을 채워야 합니다
	Student (int kor, int eng, int math) {
		total = kor + eng + math;
		avg = total / 3.0;
	}
	
	// 이름과 합계, 평균을 출력하는 메서드를 작성합니다
	// - 단 평균은 소수점 두번째 자리까지만 출력합니다.
	public void show() {
		String.format("이름 : %s, 합계 : %d, %.2f", name, total, avg);
	}
	
	// 멤버 필드와 지역변수의이름이 겹칠때
	// 그냥 쓰면 지역변수(가까운것부터 참조하기 때문)
	// this.을 붙이면 멤버 필드(this는 객체 자신을 가리키기 때문)
	// 멤버필드임을 강조하고 싶다면, this를 붙여도 된다
	
}

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		int kor, eng, math;							// 국, 영, 수 점수를 입력받을 kor, eng, math 변수 선언
		
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());		// 국어점수 입력받음
		
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());		// 영어점수 입력받음
		
		System.out.print("수학점수 입력 : ");
		math = Integer.parseInt(sc.nextLine());		// 수학점수 입력받음
		
		Student stu = new Student(kor, eng, math);	// Student 객체 생성
													// - 생성자를 매개변수를 입력받도록 설정하였으므로
													// - 국, 영, 수 점수를 매개변수로 전달
		
		stu.show();									// 이름과 성적 합계, 평균을 출력하는 show() 메서드를 
													// Student 클래스의 stu 객체를 통해 실행
	}
}
