package quiz1;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		// 놀이기구 이용 시간에 따른 이용 요금을 계산하려고 한다
		// 기본 요금은 3000원 이며, 10분마다 500원의 추가요금이 발생한다
		// 요금표는 다음과 같다
		//  0 ~ 30	: 3000
		// 31 ~ 40	: 3500
		// 41 ~ 50	: 4000
		// 51 ~ 60	: 4500
		// ...
		
		// 반복문 사용 없이 if를 이용하여 시간을 분 단위로 입력받고 요금을 계산하여 출력하세요
		
		int base_rate = 3000;		// 기본요금 3000원을 base_rate변수에 초기화
		int fee = 500;				// 10분당 요금 500원을 fee변수에 초기화
		int total = base_rate;		// 총 요금 total변수에 초기 요금 저장
		int time;					// 이용시간 입력받을 time변수 선언
		
		Scanner sc = new Scanner(System.in);		// 값을 입력 받을 Scanner 클래스 생성
		System.out.println("놀이기구 이용시간 입력 : ");
		time = Integer.parseInt(sc.nextLine());		// time에 이용시간 입력하여 저장
		
		if (time > 30) {							// 기본요금 시간이 지나면
			if (time % 10 == 0) {					// 시간이 정확히 10분이 지나면
				// - (총 시간이 정확히 10분단위로 떨어지면 10을 나눈 몫에 3을 빼서 500원이 추가계산되지 않도록 설정)
				total += ((time / 10 - 3) * fee);	// 총 요금에 추가 요금을 누적 정산하여 총 요금 계산
			}
			else {									// 10분이 정확히 지나지 않으면
				// - (총 시간이 정확히 10분단위로 떨어지면 10을 나눈 몫에 3을 빼서 500원이 추가계산되지 않도록 설정)
				total += ((time / 10 - 2) * fee);	// 총 요금에 추가 요금을 누적 정산하여 총 요금 계산
			}
		}

		
		System.out.printf("%d분 놀이기구 이용 금액 : %d\n",time, total);	// 이용시간과 비용을 서식문자를 이용하여 출력
		
		sc.close();	// Scanner 클래스 종료
	}
}
