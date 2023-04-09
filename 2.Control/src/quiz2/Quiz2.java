package quiz2;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 엘리베이터 이동
		// - 이용객이 호출한 층에서 가장 가까운 엘리베이터가 움직이도록 설정
		// ea : 1, eb : 8, ec : 3
		// 입력 : 7
		// 출력 : eb 엘리베이터가 이동합니다
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();				// 현재 위치를 무작위로 받기 위한 Random클래스 
		int ea = ran.nextInt(15) + 1;			// ea호의 현재 층(무작위)
		int eb = ran.nextInt(15) + 1;			// eb호의 현재 층(무작위)
		int ec = ran.nextInt(15) + 1;			// ec호의 현재 층(무작위)
		int current;
		
		// 결과 검증을 위한 현재 층 모두 출력
		System.out.printf("ea : %d, eb : %d, ec : %d\n", ea, eb, ec);
		
		System.out.print("현재 호출한 층 : ");
		current = Integer.parseInt(sc.nextLine());	// 이용자가 있는 현재 층
		
		int distEa = current - ea;	// 이용자와 ea호기의 거리
		int distEb = current - eb;	// 이용자와 eb호기의 거리
		int distEc = current - ec;	// 이용자와 ec호기의 거리
		int distResult;				// 이용자와 엘리베이터 거리를 비교하여 가까운 층을 저장할 변수
		String drive;				// 가동될 엘리베이터 문자열로 출력하기 위해 해당 값을 저장할 변수
		
		// 거리는 절대값으로 구해야 하기 때문에 음수인 거리값을 양수로 변경
		if (distEa < 0) {
			distEa *= -1;
		}
		if (distEb < 0) {
			distEb *= -1;
		}
		if (distEb < 0) {
			distEb *= -1;
		}
		
		// ea호기와 eb호기의 거리를 비교하여
		distResult = (distEa < distEb) ? distEa : distEb;	// ea호기가 더가까우면 ea호기와의 거리를 아니라면 eb호기를 저장
		// 결과 출력을 위해 ea호기가 더가까우면 ea호기를 아니라면 eb호기를 문자열로 drive에 저장
		drive = (distEa < distEb) ? "ea" : "eb";			
		
		if (distResult < distEc) {	// 위의 결과와 ec호기를 비교하여 위의 결과값이 더 가까운경우
			System.out.printf("%s 엘리베이터가 이동합니다\n", drive);	// 해당 결과값을 출력
		}
		else {	// ec호기가 더 가깝다면
			drive = "ec";	// ec를 문자열로 drive에 저장해주고
			System.out.printf("%s 엘리베이터가 이동합니다\n", drive);	// 해당 결과값을 출력	
		}
		System.out.println();
		
		sc.close();
	}
}
