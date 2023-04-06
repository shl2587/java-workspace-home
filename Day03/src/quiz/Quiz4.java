package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일 6자리를 정수로 입력받아서, 년, 월, 일로 구분하고
		// 현재 연도를 이용하여 나이를 계산하세요
		// 그런 다음, 출생년도는 4자리로 만들어서 연월일과 현재 나이를 출력해주세요
		// 나이가 20이상이면 성인, 아니면 미성년자로 만들어서 함께 출력합니다
		
		Scanner sc = new Scanner(System.in);		// 값을 입력받은 Scanner 클래스 생성
		
		int birth, age;				// 생년월일을 입력받을 birth와 계산된 나이를 저장받을 age변수 선언
		int year, month, day;		// 생년월일 6자리를 년, 월, 일로 나누어 각각 값을 저장할 year, month, day변수 선언
		int this_year = 2023;		// 나이를 계산하기 위한 올해 년도를 저장
		String ageGroup = "미성년자";	// 성인 미성년자를 출력할 ageGroup 문자열 선언 및 "미성년자"로 초기화 
		
		
		System.out.print("생년월일 6자리 입력 : ");
		birth = Integer.parseInt(sc.nextLine());	// 생년월일 입력받음
				
		year = birth / 10000;			// 생년월일 6자리를 10000으로 몫을 구해 년도로 저장
		month = birth % 10000 / 100;	// 생년월일 6자리를 10000으로	나머지를 구해 월일만 남긴 후 100으로 몫을 구해 월을 도출
		day = birth % 100;				// 생년월일 6자리를 100으로 나머지를 구해 일수를 구함
		
		
		// 올해 년도에서 100으로 나머지를 구해 차이를 계산 한뒤 0이상 올해 미만으로 나오면 2000년대로 계산
		if ((this_year % 100) - year  >= 0 && (this_year % 100) - year < 23) {
			year += 2000;
		}
		// 올해 년도에서 100으로 나머지를 구해 차이를 계산 한뒤 0미만 올해와 같거나 초과로 나오면 1900년대로 계산
		else {
			year += 1900;
		}
		age = this_year - year + 1;	// 20세기 21세기 구분 뒤 실제 나이를 계산하여 age에 저장
		
		if (age >= 20) {			// 저장된 age의 값이 20보다 크거나 같으면 
			ageGroup = "성인";		// "성인"으로 문자열 저장
		}
		
		String result = 	// 결과를 출력할 문자열을 저장할 result변수 선언
				String.format("%d년 %d월 %d일 출생, %d세, %s입니다.",	// 년, 월, 일, 나이, 성인/미성년자 구분하여 출력할 문장 저장
						year, month, day, age, ageGroup);
		
		System.out.println(result);	// 결과 출력
		
		sc.close();	// Scanner 클래스 종료
		
		
	}
}
