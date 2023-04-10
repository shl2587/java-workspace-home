package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// while을 활용하여 다음 문제를 풀어주세요
		
		// 1) Hello, world 를 3번만 출력하세요
		int num1 = 1;		// 횟수 통제를 위한 정수 변수 num1 선언 및 횟수 출력을 해주기 위해 1로 초기화
		while (num1 < 4) {	// num1이 4가되면 중단하도록 조건 설정
			System.out.printf("%d번째 : Hello, world\n", num1);	// 문장출력과 함께 횟수 출력
			num1++;		// 횟수 통제를 위한 증감식
		}
		System.out.println();
		
		
		// 2) 1부터 20까지 한 줄에 띄어쓰기로 구분하여 출력하세요
		int num2 = 1;		// 1 ~ 20 출력을 위한 정수 num2변수 선언 및 1로 초기화
		while (num2 <= 20) {	// 20까지 출력하기 위한 범위 설정
			System.out.printf("%d ", num2);	// 한줄 출력을 위한 printf와 서식문자를 이용한 정수 출력 및 띄어쓰기
			num2++;			// 증가하는 수를 출력하기 위한 증감식
		}
		System.out.println();
		
		// 3) A부터 Z까지 한 줄에 콤마로 구분하여 출력하세요
		// - 단, 마지막에는 콤마가 없어야 합니다
		char ch1 = 'A';	// 알파벳 대문자를 출력하기 위한 char ch1변수 선언 및 'A'로 초기화
		int num3 = 1;	// 반복횟수를 통제하기 위한 정수 num3 선언 및 1로 초기화
		while (num3 <= 26) {	// 알파벳 수만큼 횟수 제어
			System.out.print(ch1++);	// char고유 속성인 아스키코드를 활용하여 증감식으로 출력
			if (num3 != 26) {
				System.out.print(", ");	// ', '로 구분하되 마지막 Z다음에는 나오지 않도록 25회까지만 출력
			}
			num3++;	// 횟수 제어를 위한 증감식
		}
		System.out.println("\n");
		
		// 4) 1부터 100 사이의 정수 중 홀수의 합과 짝수의 합을 각각 계산하여 출력하세요
		int evenSum = 0;	// 짝수의 합을 저장할 evenSum 변수 선언 및 0으로 초기화
		int oddSum = 0;		// 홀수의 합을 저장할 oddSum 변수 선언 및 0으로 초기화
		int num4 = 1;		// 1 ~ 100의 범위 제어를 위한 num4 변수 선언 및 1로 초기화
		
		while (num4 <= 100) {		// num4를 통하여 100까지의 범위 제한을 위한 제어문 작성
			if (num4 % 2 == 0) {	// 짝수를 선별을 위해 2로 나누어 나머지가 0인 수를 구하기 위한 제어문 작성
				evenSum += num4;	// 짝수의 누적 합을 위한 복합대입연산자 활용
				num4++;				// 증감식을 통한 다음 정수
			}
			else {
				oddSum += num4;		// 위의 조건을 통과하지 못한 나머지 수는 홀수이므로 oddSum변수로 누적 합산
				num4++;				// 증감식을 통한 다음 정수
			}
		}
		System.out.println("짝수의 합 : " + evenSum);	// 짝수의 합 출력
		System.out.println("홀수의 합 : " + oddSum);	// 홀수의 합 출력
		System.out.println();
		
		// 5) 입력받은 정수를 거꾸로 출력하세요
		// 입력 : 1234
		// 출력 : 4321
		Scanner sc = new Scanner(System.in);			// 정수를 입력받을 'Scanner' 클래스 생성
		int num5, result = 0;			// 정수를 입력받아 저장할 num5 변수 선언
										// 반대로 출력할 정수를 저장하는 result변수 선언 및 0으로 초기화
		System.out.print("거꾸로 출력할 정수 입력 : ");
		num5 = Integer.parseInt(sc.nextLine());	// 정수 입력
		
		while(num5 != 0) {	// 입력받은 정수를 몫으로 누적 나눗셈할 예정이므로 해당 제어문으로 횟수 제어(
							// - 몫으로 누적 나눗셈을 하면 몫이 결국 0이되는 순간이 발생
			result *= 10;	// 10을 누적으로 곱하여 처음 추출된 수가 앞자리 수가 되게 함
							// - 뒤에 곱하게 되면 마지막값에 10이 곱해져 가장 마지막 수가 무조건 0이 되기때문에 제일 처음 연산 
			result += (num5 % 10);	// 입력받은 수의 나머지(10이 누적으로 곱해짐)를 result변수에 누적으로 더해줌
			num5 /= 10;		// 사용된 수를 제거하기 위해 누적 나눗셈 진행
		}
		System.out.println("정답 : " + result);
		sc.close();
	}
}
