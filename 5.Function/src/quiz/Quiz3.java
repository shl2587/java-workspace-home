package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 1) 정수 하나를 전달받아서, 정수를 뒤집은 값을 반환하는 함수
		System.out.print("해당 함수 실행할 정수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		int test1 = reverseNumber(num1);
		System.out.println("정수를 뒤집은 값 : " + test1);
		
		// 2) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수
		System.out.print("비교할 세 정수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		int num4 = Integer.parseInt(sc.nextLine());
		int test2 = biggestNumber(num2, num3, num4);
		System.out.println("가장 큰 정수 : " + test2);
		System.out.println();
		
		// 3) 놀이기구 이용시간에 따른 요금을 반환하는 함수
		// 단, 최초 30분은 3000원으로 고정 요금이며 10분마다 500원씩 추가
		System.out.print("이용시간 입력(분) : ");
		int time = Integer.parseInt(sc.nextLine());
		int test3 = totalFee(time);
		System.out.println("요금 정산 : " + test3 + "원");
		System.out.println();
		
		// 4) 지하철 구간당 3분, 구간 수를 전달받아서 걸린 시간을 반환하는 함수
		// 단, 60분을 초과하면 시간과 분을 각각 출력한다 (문자열 반환)
		System.out.print("지하철 구간 수 입력 : ");
		int totalLocation = Integer.parseInt(sc.nextLine());
		String test4 = totalTimeTaken(totalLocation);
		System.out.println(test4);
		
	}
	
	
	// 1) 정수 하나를 전달받아서, 정수를 뒤집은 값을 반환하는 함수
	static int reverseNumber(int num1) {	// 정수를 반환하는 int 자료형 함수 선언
											// 값을 전달 받을 매개변수 int num1 선언
		int answer = 0;				// 반환할 값을 받을 answer 정수 변수 선언
									// - 덧셈 복합대입 연산을 위해 항등원 0으로 초기화
		while (num1 != 0) {			// 몫 나눗셈 복합대입 연산으로 매개변수로 전달 받은 값을 변동시킬 예정이므로
									// - 해당 변수의 값이 0이 되면 반복문이 종료 되도록 설정
			answer *= 10;			// 다음 순번의 수를 더하려면 10의 자리수로 만들어주기 위해
									// - 곱의 복합 대입 연산자를 통해 10의 자리를 계속 증가
			answer += (num1 % 10);	// answer변수에 나머지 나눗셈을 활용하여 맨 끝의 숫자를 저장해줌 
			num1 /= 10;				// 몫 나누셈 복합대입 연산자를 통해 저장된 끝자리수를 제거
			
		}
		return answer;				// 정답 반환
	}
	
	
	// 2) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수
	// 토너먼트 형식으로 먼저 2개의 수를 비교한 다음 
	// - 둘중에 더 큰 수와 남은 수를 비교하여 더 큰 수가 정답이라고 생각
	static int biggestNumber(int num2, int num3, int num4) {	
		int answer = (num2 > num3) ? num2 : num3;	// num2과 num3를 비교하여
													// 삼항연산자를 통해 더 큰 수를 answer변수에 저장
		return answer > num4 ? answer : num4;		// answer변수에 저장된 수와 나머지 수를 비교하여 더 큰 수를 반환
	}
	
	
	// 3) 놀이기구 이용시간에 따른 요금을 반환하는 함수 
	static int totalFee(int time) {		// 요금(정수)를 반환하기 위한 정수형 함수 작성
										// 시간을 전달받을 매개변수 int time을 선언
		int fee = 3000;					// 기본요금으로 초기화하는 int fee 변수 선언
		if (time > 30) {							// 만약 기본요금이 부과되는 시간인 30분이 초과하면
			fee += ((time - 30) / 10 + 1) * 500;	// 입력 시간에서 기본 시간을 빼준 값의 몫에 1을 더하여
													// 추가 요금이 계산될 수 있도록 해줌
		}
		return fee;		// 계산된 요금 반환
	}
	
	
	// 4) 지하철 구간당 3분, 구간 수를 전달받아서 걸린 시간을 반환하는 함수
	static String totalTimeTaken(int totalLocation) {		// 문자열 반환을 위한  static 함수 선언
		int tTaken = totalLocation * 3;						// tTaken으로 총 소요시간 계산 
		int hour = 0, minutes = 0;							// 시간을 저장하기 위한 hour 분을 저장하기 위한 minutes를 선언하고 0으로 초기화 
		String result = "소요시간 : %d분";						// 60분이 초과하지 않으면 분으로만 출력하기 위한 문자열 result 선언
		if (tTaken > 60) {									// 60분 초과 시
			hour = tTaken / 60;								// 시간을 몫으로 정하고
			minutes = tTaken % 60;							// 나머지를 분으로 저장
			result = "소요시간 : %d시간 %d분";					// 해당 조건에서는 시간을 출력하는 문자열로 저장
			return String.format(result, hour, minutes);	// 조건에 충족하는 문자열 반환
		}
		return String.format(result, tTaken);				// 위의 조건이 충족하지 않는다면 분으로만 출력
	}
}
