package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받아서 합계를 구하고
		// a + b = c 의 형식으로
		// 정답을 포함한 수식을 화면에 출력해주세요
		
		
		Scanner sc = new Scanner(System.in);		// 정수를 입력받기위한 Scanner클래스 생성
		int num1, num2;								// 더할 두 수를 저장할 변수 선언
		int sum;									// 두 수의 합을 저장할 변수 선언
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());		// num1 변수에 정수를 저장해주기 위한 입력 메소드 입력
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());		// num2 변수에 정수를 저장해주기 위한 입력 메소드 입력
		
		sum = num1 + num2;							// num1과 num2의 합을 저장
		System.out.println();						// ※ 변수에 다른 변수값을 저장하기 위해선 저장할 변수를 우선으로 입력해줘야함!!!
		
		System.out.printf("%d + %d = %d", num1, num2, sum);	// 서식 문자를 활용하여 a + b = c 형태의 수식 출력
		
		sc.close();									// 메모리 누수를 차단하기 위한 Scanner 클래스 종료
	}
}
