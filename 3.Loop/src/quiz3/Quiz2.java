package quiz3;

public class Quiz2 {
	public static void main(String[] args) {
		// 2023년 3월의 달력을 이중 for문으로 표현하세요
		// 단, 요일은 [일, 월, 화, 수, 목, 금, 토]의 순서로 출력해야 하고
		// 3월은 1일부터 31일까지 있습니다
		// 범위에 포함되지 않은 칸은 빈칸으로 두어야 합니다
		int day = 1;	// 날짜를 표현하기 위한 정수형 day변수 선언
		
		System.out.println("======================== 2023년 03월 ========================");
		System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토\t ");
		
		for(int i = 1; i <= 5; i++) {					// 열을 통제하기 위한 for 제어문
			for (int j = 1; j <= 7; j++) {				// 행을 통제하기 위한 for 제어문
				if (i == 1 && j < 4) {					// 첫번째 열에서 일, 월, 화를 빈칸으로 출력하기 위한 제어문 
					System.out.print("\t");				// 빈칸 출력 
				}
				else {									// 상기 조건이 끝나면 날짜 출력 시작
					if (j == 1) {
						System.err.printf("%d\t", day);	// 일요일 마다 날짜를 빨간색으로 출력
					}
					else {
						System.out.printf("%d\t", day);	// 서식문자를 활용하여 일렬로 날짜 출력
					}
					if (day == 31) break;				// 31일이 되면 반복문 종료
					day++;
				}
			}
			System.out.println();						// 행이 끝날때마다 다음 열로 진행
		}
		
		
	}
}
