package quiz2;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws Exception {
		// 사용자에게 타이머 시간을 분단위로 입력받아서
		// 분:초 형식으로 타이머를 출력하면서 0까지 출력하고 나면 종료를 출력하는 코드를 작성하세요
		// 분과 초는 2자리의 정수로 출력하되, 자릿수가 부족하면 0으로 채워줘야 합니다
		
		// 입력 (분) : 2
		// 출력
		// 02 : 00
		// 01 : 59
		// 01 : 58
		// 01 : 57
		// ...
		// 종료
		
		Scanner sc = new Scanner(System.in);	
		int timer;		// 시간을 입력받을 정수형 변수 timer 선언
		
		System.out.print("시간을 입력하세요 : ");
		timer = Integer.parseInt(sc.nextLine());	// 시간을 표현할 타이머 입력 받음
		
		for (int i = timer; i != -1; i--) {			// 지역 변수 i에 timer로 초기화 하고 감소하는 반복문
			System.out.printf("%02d : %02d\n", i / 60, i % 60);	// 몫은 분으로 나머지는 초를 나타냄
																// 서식문자(%02d)를 이용하여 부족한 자릿수를 2로 맞춤
																// - 0은 비어있는 자릿수를 채움
			Thread.sleep(1000);		// Thread.sleep을 이용하여 1초마다 정지시켜 시간을 흘러감을 표현
		}
		System.out.println("종료");	// 끝나고 종료 출력
		
		
		
		sc.close();
		
	}
}
