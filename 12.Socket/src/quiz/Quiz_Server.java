package quiz;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz_Server {
	public static void main(String[] args) throws Exception {	// 모든 예외를 한번에 처리
		// 내 컴퓨터가 접속을 받기 위해서 7777번 포트를 사용하여 접속을 받을 수 있도록 한다
				// 프로그램이 특정 포트를 사용하기 위해서는 운영체제의 허락을 받아야하며, 방화벽에서 열려있어야 한다
				// 실행 - wf.msc - 인바운드 규칙 - 새 규칙 - tcp, 7777, 적당한 설명과 함께 허용으로 규칙 추가
				ServerSocket ss = new ServerSocket(7777);
				
				// 클라이언트가 접속할 때까지 기다린다. 클라이언트의 요청이 오는지 귀를 기울여 듣고 있는 상태(Listen)
				System.out.println("[Server] Listening...");
				
				// 클라이언트가 내 서버에 접속하면 대상을 가리키는 소켓을 받아올 수 있다
				Socket so  = ss.accept();
				
				// 접속한 클라이언트의 정보를 담고 있는 객체
				InetAddress inet = so.getInetAddress();
				System.out.println("접속한 프로그램의 IP : " + inet);
				
				// 소켓으로부터 넘어오는 정보를 받아들이기 위한  Scanner
				Scanner sc = new Scanner(so.getInputStream());
				
				String data = sc.nextLine();
				System.out.println("전송받은 데이터 : " + data);
				
				sc.close(); // 스케너(데이터 연결통로) 닫기
				so.close(); // 소켓(대상과 접속) 닫기
				ss.close(); // 서버소켓(다른 클라이언트가 접속할 수 있는 연결) 닫기
	}
}
