package quiz;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Quiz_Client {
	public static void main(String[] args) throws Exception {
		Socket so = new Socket("127.0.0.1", 7777);
		// 소켓 객체는 생성시, 접속할 대상의 주소와 포트번호를 매개변수에 넣어준다
		// 포트는 0 ~ 65535의 범위를 가진다
		
		// 소켓에서 지정한 대상에게 데이터를 내보내기 위한 스트림을 생성
		OutputStream os = so.getOutputStream();
		
		// 글자(텍스트)를 보내기 위해서 Writer형식으로 만듬
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		// 버퍼 단위로 출력하기 위해서 객체 생성
		BufferedWriter bw = new BufferedWriter(osw);
		
		// 키보드로 입력받기 위한 Scanner
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Client] 연결되었습니다");	
		System.out.println("서버에 전송할 메시지 입력 : ");
		String text = sc.nextLine();		// 클라이언트의 키보드로 입력받아서
		bw.write(text);						// 입력받은 대상을 bw에 넣는다
		bw.newLine();						// 한줄 바꾼다
		bw.flush();							// flush해서 버퍼 내용을 밀어서 보낸다
		pw.close();							
		
		sc.close();
	}
}
