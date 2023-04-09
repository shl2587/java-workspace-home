package quiz1;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
			// 세 정수를 입력받아서 그 중 가장 큰 수를 화면에 출력하세요
		
			Scanner sc = new Scanner(System.in);		// 세 정수를 입력받을 Scanner 클래스 생성
				
			int num1, num2, num3;						// 입력받을 세 정수 num1, num2, num3 변수 선언
			int max;									// 최대값을 저장할 변수 max 선언
			System.out.print("첫 번째 정수 입력 : ");			
			num1 = Integer.parseInt(sc.nextLine());		// num1 입력 받음
			
			System.out.print("두 번째 정수 입력 : ");
			num2 = Integer.parseInt(sc.nextLine());		// num2 입력 받음
			
			System.out.print("세 번째 정수 입력 : ");
			num3 = Integer.parseInt(sc.nextLine());		// num3 입력 받음
			
						
			// 두 수를 비교하고 더 큰 수를 나머지 수와 비교하여 결과 도출
			if ( num1 > num2) {		// num1이 num2보다 더 크다면
				// num1을 num3과 비교하여 삼항연산자를 통해 결과를 도출하여 max에 저장
				max = (num1 > num3) ? num1 : num3;			
				System.out.println("가장 큰 정수 : " + max);	// 최대값 출력
			}
			else if (num1 == num2){	// num1이 num2와 같다면
				// num1(num2를 사용해도 무관)과 num3을 비교하여 삼항연산자를 통해 결과를 도출하여 max에 저장
				max = (num1 > num3) ? num1 : num3;			
				System.out.println("가장 큰 정수 : " + max);	// 최대값 출력
			}
			else {	// 위의 2조건 외의 num2가 num1보다 큰 경우
				// num2와 num3을 비교하여 삼항연산자를 통해 결과를 도출하여 max에 저장
				max = (num2 > num3) ? num2 : num3;
				System.out.println("가장 큰 정수 : " + max);
			}
			
			/*	<강사님  답안>
			 *	if (n1 > n2 && n1 > n3) {	// n1이 n2와 n3 보다 모두 큰 경우
			 *		max1 = n1; 				// n1을 결과값으로 도출
			 * 	}
			 *	else if(n2 > n1 && n2 > n3) {	// n2가 n1과 n3 보다 모두 큰 경우
			 *		max1 = n2;					// n2를 결과값으로 도출
			 *	}
			 *	else {			// 위의 2가지경우가 모두 아닐때
			 *		max1 = n3;	// n3을 결과값으로 도출 
			 *	}
			 *
			 *	해당 답안이 가독성이 더욱 높다고 생각함
			 *	- 최대값이란 결국 나머지 수보다 큰 수이니 해당 조건문이 더욱 직관적이라고 생각함
			 */
	}
}
