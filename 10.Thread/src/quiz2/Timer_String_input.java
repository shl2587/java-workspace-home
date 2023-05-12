package quiz2;

import java.util.ArrayList;
import java.util.Scanner;

class Timer_update implements Runnable{	// Thread를 구현하기 위한 Runnable 인터페이스 상속
	
	private int time = 10;	// run()메서드 및 main의 반복문 통제를 위한 time 선언 및 10으로 초기화

	@Override
	public void run() {	// 오버라이딩 된 run() 메서드 생성
		for (int i = time; i != -1; i--) {	// 10초를 세어줄 반복문 생성
			System.out.printf("[00 : %02d]\n", time);	// printf를 통해 카운트 다운 시작
			time--;	// main에 값을 전달하기 위해 감소
			try {
				// 반복문 실행 시간을 제어 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	// 생길 수 있는 오류 처리

			} 
		}
	}

	
	
	// getter / setter 선언
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}

public class Timer_String_input {
	public static void main(String[] args) throws Exception{
		
		// 실행 후 10초간 타이머를 진행하면서, 10초동안 입력받은 문자열을 모두 list에 저장합니다
		// 개수에는 제한이 없습니다
		// 10초가 끝나면, list에 담아둔 문자열을 차례대로 출력하면 됩니다
		// 시간을 체크하면서, 입력도 받아야 한다

		Scanner sc = new Scanner(System.in);	
		ArrayList<String> list = new ArrayList<>();	// 입력한 문자열을 저장할 ArrayList
		Timer_update t = new Timer_update();	// Timer_update 클래스 객체 생성
		Thread th = new Thread(t);				// 쓰레드를 통해 동시 실행 설정
		String str;	// 입력 할 문자열 변수 str 선언
		
		th.start();	// Thread start시작
		
		while(true) {	// 무한 반복을 통해 문자열 지속적으로 입력받음
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();	// 문자열 입력
			list.add(str);			// list에 문자열 저장
			if (t.getTime() == 0) {	// Timer_update객체로 getter를 통한 필드 변수 time의 값을 불러와 0이 되면
				break;				// 반복문 종료
			}
		}
		

		

		
		
		System.out.println(list);	// list출력
		
		sc.close();
	}
}
