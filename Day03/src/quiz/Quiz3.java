package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 지하철 한 구간 당 약 3분의 시간이 소요된다고 가정한다
		// 이동한 지하철 구간 수를 입력받아서
		// 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하고
		// 60분 이하이면 분으로만 출력하세요
		// 문자열의 형식을 지정하기 위해서 String.format(format, args...)함수를 사용
		
		Scanner sc = new Scanner(System.in);		// 값을 입력받을 Scanner클래스 생성
		int time = 3;								// 한 구간당 소요되는 시간 time변수로 선언
		int station, total;							// 정류장 수와 총 소요시간을 저장할 station, total변수 선언
		String result;								// 출력문을 저장할 result 변수 선언
		
		System.out.println("정거장 수 입력 : ");
		station = Integer.parseInt(sc.nextLine());		// 정거장 수 입력
		// 총 소요시간을 입력받은 station(정거장 수)와 한 구간당 소요 시간인 time을 곱하는 수식을 저장
		total = station * time;				
		
		// 문제의 조건을 충족시키기 위해 String.format으로 출력문 저장
		result = String.format("%d분", total);		
		
		if (total > 60) {	// 총 소요시간이 60분보다 클 경우
			result = String.format("%d시간 %d분", total/60, total%60);	// 총 소요시간을 60으로 나눈 몫은 시간으로
		}																// 나머지를 분으로 분류하여 저장
		
		System.out.println(result);		// 결과 출력
		
		sc.close();	// Scanner 클래스 종료
	}
}
