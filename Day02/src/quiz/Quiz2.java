package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		/*
		 * 세 과목의 점수를 정수형태로 입력받고, 이름은 문자열로 입력받으세요
		 * 그런 다음 점수의 합계와 평균을 구합니다
		 * 이때, 평균은 실수형태로 소수점 둘째자리까지 출력할 수 있도록 준비하세요
		 * 
		 * 모든 준비가 끝나면 이름과 합계와 평균만 출력합니다
		 * 
		 * 추가내용) boolean 타입의 변수를 선언하여, 평균이 60점 이상인지 아닌지 판별하여
		 * 결과를 출력하세요
		 * 합격여부 : true
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;						// 세 과목의 점수를 입력받을 변수 kor, eng, mat입력
		int total;								// 세 과목의 점수를 합한 값을 저장할 정수 변수 선언
		double avg;								// 성적의 평균을 저장할 실수 변수 선언(평균은 실수의 값으로 받는 것이 좋음)
		
		System.out.print("학생 이름 입력 : ");
		name = sc.nextLine();					// 성적을 입력받을 학생 입력 
		
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());	// 첫 번째 성적 입력
		
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());	// 두 번째 성적 입력
		
		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(sc.nextLine());	// 세 번째 성적 입력
		
		total = kor + eng + mat;				// 점수의 합계를 구하는 수식
		avg = total / 3.0;						// 성적의 평균을 구하는 수식
		System.out.println();					// ※ 정수를 실수로 나눔으로써 자동 형변환 실행
		
		System.out.printf("%s의 성적 >>> \n", name);					// 학생의 이름을 출력
		System.out.printf("합계 : %d, 평균 : %.2f\n", total, avg);		// 조건에 따른 합계와 평균만 출력
		
		// 추가 문제
		boolean flag = (avg >= 60);				// 평균 60이상 여부를 판별하는 변수 선언 및 초기화
		System.out.println("합격여부 : " + flag);	// 합격 여부 결과 출력
		
		
	}
}
