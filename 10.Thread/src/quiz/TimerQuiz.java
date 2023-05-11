package quiz;

import java.util.Scanner;

class Count implements Runnable{	// run메서드를 오버라이딩하기 위해 Runnable 인터페이스 상속

	private String result;	// 시간 초과를 나타내기 위해 result 변수 선언
	
	@Override
	public void run() {
		for (int i = 5; i != -1; i--) {
			System.out.printf("[00 : %02d]\n", i);		// 시간 카운트 출력문
			if (i == 0 && result == null) {		// 시간이 다되었을때 정답이 들어오지 않으면	
				System.err.println("시간초과!!!");	// 시간초과 에러문 출력
			}
			if (result != null)	break;	// result에 정답이 입력되면 시간 카운트 종료
			
			// Thread 클래스 예외 처리 위한 try / catch
			try {
				Thread.sleep(1000);		// Thread 클래스와 sleep메서드를 활용하여 반복문 실행 시간 조절
			} catch (InterruptedException e) {
				e.printStackTrace();	// 예외사항
			}
		}
	}


	// 정답을 출력 / 입력을 위한 getter/settter 생성
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}

public class TimerQuiz {
	public static void main(String[] args) {
		// 5초안에 정답을 입력하기
		// 1) 답을 입력하면 정답 / 오답 여부에 상관없이 타이머는 중단한다
		// 2) 입력값이 정답이더라도, 시간을 초과했다면 오답으로 처리한다
				
		Scanner sc = new Scanner(System.in);
		String answer = "1";	// 정답을 저장한 answer 문자열 변수 선언 및 초기화
		String result = null;	// 정답을 입력하지 않으면 null값 처리
		
		Count c = new Count();	// Count클래스의 객체생성
		Thread thr = new Thread(c);	// Thread 클래스의 객체 생성과 동시에 Count 클래스 객체 삽입
		
		System.out.println("다음중 세계무역기구를 고르시오");
		System.out.println("1. WTO");
		System.out.println("2. IMF");
		System.out.println("3. UN");
		System.out.println("4. Fed");
					
		thr.start();	// 객체 c가 동시 실행됨
		
		
		System.out.print("정답 ? : ");
		System.out.println();
		result = sc.nextLine();	// 정답을 입력
		c.setResult(result);	// 정답을 Count 클래스에 setter로 전달
		
		if (result != null) {	// 정답이 입력되었을때
			if (answer.equals(result)) {	// 저장된 정답과 같으면
				System.out.println("정답입니다!!!");	// 해당 구문 출력
			}
			else {							// 저장된 정답과 다르면
				System.err.println("오답입니다!!!");	//	해당 구문 출력	
			}
		}
		
		sc.close();
		
	}
}
