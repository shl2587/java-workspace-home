package quiz3;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		String s1 = "┌────┬────┬────┬────┬────┬────┐";
		String s2 = "|||||||||||||||||||||||||||||||";
		
		String arrow = "↑";
		
		// 정수를 입력받아서 입력받은 위치를 화살표가 가리키도록 코드를 작성해주세요
		Scanner sc = new Scanner(System.in);
		int location;	// 위치를 정하기 위한 정수형 location 변수 선언 
		
		
		System.out.print("길이를 입력하세요 : ");
		location = Integer.parseInt(sc.nextLine());	// 위치를 입력받음
		
		// 자를 출력
		System.out.println(s1);
		System.out.println(s2);
		
		
		for (int i = 1; i <= s2.length(); i++) {	// 빈칸을 삽입하기 위한 제어문
			System.out.print(" ");					// 빈칸을 출력
			if (i == location) {					// 빈칸을 출력하다 입력한 정수와 지역변수 i와의 값이 같아지면
				System.out.print(arrow);			// 화살표를 해당 위치에 출력
				break;								// 반복문 종료
			}
		}
	}
}
