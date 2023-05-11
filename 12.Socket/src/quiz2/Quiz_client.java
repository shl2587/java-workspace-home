package quiz2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Quiz_client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 입력받는 scanner
		
		// Socket과 PrintWriter를 생성 시 예외 발생이 일어나기 때문에
		// try / catch로 잡아주기 위해 초기값을 null 값으로 정하고
		// 아래에서 생성
		Socket so = null;
		PrintWriter pw = null;
		
		// 전송할 메시지를 입력할 msg 문자열 선언
		String msg;
		
		
		try {
			// 서버에 접속하기 위하여 Socket과 PrintWriter 생성
			so = new Socket("192.128.112.7", 7777);
			pw = new PrintWriter(so.getOutputStream());
			while(true) {	// 메시지를 모두 보내기 위해 무한반복
				System.out.println("서버에게 보낼 메시지 입력 : ");
				msg = sc.nextLine();	// 메시지 입력
				pw.println("[Client] " + msg);	// 양방향 통신이기 때문에 client임을 밝힘
				pw.flush();						// flush()를 통해 메시지 밀어냄 
				if(msg.equals("종료")) {	// "종료"라고 들어오면
					break;				// 종료
				}
			}	// end of while
		}
		 catch (IOException e) {
			e.printStackTrace();
		} finally { // 닫을 수 있는 클래스 전부 닫아줌(메모리 누수 방지)
			try { if(sc != null) sc.close(); } catch(Exception e) {}
			try { if(so != null) so.close(); } catch(Exception e) {}
		}
		
		
	}
}
