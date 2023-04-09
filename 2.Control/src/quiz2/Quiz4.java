package quiz2;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		// 1 ~ 100까지의 정수에서 무작위 수를 저장받은 뒤
		// 정수를 입력하여 해당 값보다 큰지 작은지 출력한뒤 값을 찾으세요
		// 출력문에는 몇회 시도하였는지 같이 출력하세요
		
		Scanner sc = new Scanner(System.in);	 
		Random ran = new Random();				// 무작위 정수를 입력받기 위한 Random클래스 생성
		int question = ran.nextInt(100) + 1;	// 1~100 사이의 무작위 수를 입력받아 question에 초기화
		int answer;			// 정답을 입력하기 위한 asnwer변수 선언
		int count = 0;		// 횟수 저장을 위한 count변수 선언
		
		do {	// 최초 1회 실행하여 answer값을 입력 받기 위한 do while사용
			System.out.print("정답을 입력하세요 : ");	
			answer = Integer.parseInt(sc.nextLine());	// 정답을 입력받아 answer변수에 저장
			count++;									// 시도한 횟수를 카운트
			if (answer > question) {					// 입력한 답이 더 클경우
				System.err.println("down!!!");			// 정답이 해당 입력값보다 작다는 출력문 출력
				System.out.println();
			}
			else if (answer < question){				// 입력한 답이 더 작을경우
				System.err.println("up!!!");			// 정답이 해당 입력값보다 크다는 출력문 출력
				System.out.println();
			}
		} while (question != answer);					// 정답을 맞추기 전까지 해당 구문 반복한다는 의미
		
		System.out.printf("정답  : %d, 시도한 횟수 : %d", answer, count++);	// 정답과 시도한 횟수 출력	
		
		sc.close();
		
	}
}
