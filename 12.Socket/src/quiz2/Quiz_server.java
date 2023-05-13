package quiz2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz_server {
	public static void main(String[] args) {
		
		// 문제>>
		// 양방향 통신 하기
		
		// 객체 생성시 예외 사항을 처리해주기 위해 전부 초기값을 null로 주고
		// 포트 번호를 정하기 위한 ServerSocket
		// 서로의 네트워크를 연결하기 위한 Socket
		// 메시지를 불러오기 위한 Scanner 를 선언
		ServerSocket ss = null;
		Socket so = null;
		Scanner sc = null;	// 출력을 위한 Scanner
		String msg;
		Scanner sc2 = new Scanner(System.in);	// 입력을 위한 Scanner
		String access;	// 접속 허용 여부를 묻기 위한 success 변수 선언
		
		try {
			ss = new ServerSocket(7777);	// 포트번호 입력과 동시에 ServerSocket 객체 생성
			System.out.println("[Server] 접속 대기중...");
			System.out.print("접속 승인 여부 : ");
			access = sc2.nextLine();	// 접속 승인 여부 확인
			if (access.equals("승인")) { // "승인"이라는 문자열을 입력하면
				so = ss.accept();	// Listen Socket을 연결
			}
			else {
				System.err.println("접속 거부");	// 이외에는 "접속거부"를 출력하고
				// 모든 클래스 종료
				ss.close();
				sc2.close();
			}
			// 접속을 "승인"했으면
			System.out.println(so.getInetAddress() + "에서 접속함");	// 접속 성공을 출력
			sc = new Scanner(so.getInputStream());	// client 쪽에서 입력한 메시지를 읽음(프로그램 관점)
			
			while(true) {	// 모든 메시지를 받기 위해 무한반복을 실행
				msg = sc.nextLine();	// msg에 메시지 입력
				System.out.println(msg);	// 해당 메시지 출력
				if(msg.equals("종료")) {		// "종료"라고 입력시
					break;					// 반복종료
				}
			}
			System.out.println("[Server] 상대측에서 종료했습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {	// 모든 종료 가능 클래스 finall로 무조건 종료 시킴
			try { if(sc != null) sc.close(); } catch(Exception e) {}
			try { if(so != null) so.close(); } catch(Exception e) {}
			try { if(ss != null) ss.close(); } catch(Exception e) {}
		}
		
		
		
	}
}
