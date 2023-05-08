package quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Timer2 implements Runnable {
	
	private Scanner sc = new Scanner(System.in);
	
	private boolean stop = true;
	private String result;
	
	@Override
	public void run() {
		for (int i = 4; i != -1; i--) {
			System.out.printf("[00 : %02d]\n", i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				if (result != null) {
					break;
				}				
			}
		}
		stop = false;			
	}
	
	public String answer() {
		
		result = sc.nextLine();
		if (stop == false) {
			result = null;
		}
		sc.close();
		return result;
	}
	
	
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

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
				
				
				String answer = "1";
				String result = null;
				
				Timer2 t = new Timer2();
				Thread th = new Thread(t);
				
				System.out.println("다음중 세계무역기구를 고르시오");
				System.out.println("1. WTO");
				System.out.println("2. IMF");
				System.out.println("3. UN");
				System.out.println("4. Fed");
				
				th.start();
				
				System.out.print("정답 입력 : ");
				result = t.answer();
				if (result != null) {
					if (answer.equals(result)) {
						System.out.println("정답!!!");
					}
					else {
						System.err.println("오답!!!");
					}
				}
				else if (t.isStop() == false) {
					System.err.println("시간초과!!!");
				}
		
	}
}
