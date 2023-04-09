package quiz2;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 정수를 입력받아서 절대값을 출력하기
		int num1;	// 입력받을 정수를 저장할 변수선언
		
		System.out.print("정수를 입력하세요 : ");
		num1 = Integer.parseInt(sc.nextLine());		// 변수를 입력받아서 저장
		
		int result1 = (num1 < 0) ? -num1 : num1;
		// 결과값을 저장할 result1 변수를 선언한 뒤
		// 삼항연산자를 활용하여 num1이 0보다 작으면 '-num1'을 크면 'num1'을 초기값 저장 
		
		System.out.printf("%d의 절대값 : %d\n", num1, result1);	// 결과값 출력
		System.out.println();
		
		
		// 2) 두 정수를 입력받아서 작은 값을 출력하기
		int num2, num3;	// 비교할 두 정수를 저장할 변수 선언
		
		System.out.print("비교할 첫번째 정수를 입력하세요 : ");
		num2 = Integer.parseInt(sc.nextLine());			// 비교할 첫번째 정수 입력받아 저장

		System.out.print("비교할 두번째 정수를 입력하세요 : ");
		num3 = Integer.parseInt(sc.nextLine());			// 비교할 두번째 정수 입력받아 저장
		
		int result2 = (num2 < num3) ? num2 : num3;
		// 결과값을 저장받을 result2 변수를 선언한 뒤
		// 삼항연산자를 활용하여 num2가 더 작으면 num2를 num2가 더 크면 num3 저장
		
		System.out.println("더 작은 값 출력 : " + result2);	// 결과 출력
		System.out.println();
		
		
		// 3) 세 정수를 입력받아서 가장 작은 값을 출력하기
		int num4, num5, num6;	// 비교할 3개의 정수를 입력받을 변수 num4, num5, num6 선언
		
		System.out.print("비교할 첫번째 정수를 입력하세요 : ");
		num4 = Integer.parseInt(sc.nextLine());			// 비교할 첫번째 정수 입력받아 저장
		
		System.out.print("비교할 두번째 정수를 입력하세요 : ");
		num5 = Integer.parseInt(sc.nextLine());			// 비교할 두번째 정수 입력받아 저장

		System.out.print("비교할 세번째 정수를 입력하세요 : ");
		num6 = Integer.parseInt(sc.nextLine());			// 비교할 세번째 정수 입력받아 저장
		
		int result3 = (num4 < num5) ? num4 : num5;
		// 먼저 num4와 num5를 삼항연산자를 활용하여 비교하고 더 작은 값을 저장받을 result3 변수를 선언 후 결과값 저장
		
		// 위의 결과값과 나머지수를 비교하면 최소값을 구할 수 있음
		if (result3 < num6) {	// 먼저 비교한 값의 결과값이 더 작으면 
			System.out.println("가장 작은 값 출력 : " + result3);	// 해당 결과값을 출력
		}
		else {	// 나머지 수가 더 작으면
			System.out.println("가장 작은 값 출력 : " + num6);	// num6를 결과값으로 출력
		}
		System.out.println();
		
		
		// 4) 정수의 범위가 1에서 20사이에 포함되면 true, 아니면 false 출력하기
		boolean result4;	// 참 혹은 거짓의 결과값을 저장받을 boolean자료형의 result4 변수선언 
		int num7;			// 조건을 탐색할 정수를 입력받을 num7의 변수 선언
		
		System.out.println("조건을 탐색할 정수 입력 : ");
		num7 = Integer.parseInt(sc.nextLine());		// 조건을 탐색할 정수를 입력받아 num7에 저장 
		
		System.out.println("1~20 사이의 정수입니까? : ");
		if (1 <= num7 && num7 <= 20) {
			result4 = true;		// 1에서 20 사이에 포함되므로 result4에 true를 저장
			System.out.println("결과 확인 : " + result4);	// 해당 결과 출력
		}
		else {
			result4 = false;	// 1에서 20 사이에 포함되지 않으므로 result4에 false를 저장
			System.out.println("결과 확인 : " + result4);	// 해당 결과 출력
		}
		
		
		sc.close();
	}
}
