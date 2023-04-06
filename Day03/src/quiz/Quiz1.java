package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받아서 첫번째 정수와 두번째 정수의 크기를 비교하여
		// 크다, 같다, 작다로 구분하여 출력하세요
		
		Scanner sc = new Scanner(System.in);			// 정수를 입력받을 Scanner 클래스 생성
		
		int num1, num2;									// 값을 비교할 2개의 정수 num1, num2 선언
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(sc.nextLine());			// num1 입력받음
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());			// num2 입력받음
		
		
		String result = "%d이 %d보다 더 큽니다.\n";			// 출력문을 저장할 String result 문자열 선언 및 초기화
		if (num1 == num2) {								// 두 정수가 같으면
			result = "%d와 %d는 같습니다.\n";				// 출력문 result를 '같습니다'로 변경
		}
		
		
		if (num1 < num2) {								// num2가 더 크기때문에 
			System.out.printf(result, num2, num1);		// 초기화 문자열을 받아와 num2 num1을 차례대로 출력
		}												
		else if (num1 == num2) {						// 두 정수가 같기때문에 
			System.out.printf(result, num1, num2);		// 변경된 출력문 생성
		}
		else {											// 위의 2가지 경우를 제외한 num1이 더 큰 경우
			System.out.printf(result, num1, num2);		// 초기화 문자열을 받아와 num1 num2를 차례대로 출력
		}
		
		
		sc.close();		// 모든 구문 실행 후 Scanner 클래스 종료
	}
}
