package quiz_interface;

class computer {
	public void success(USBport port) {
		System.out.println(port.connect());
	}
}

interface USBport {
	
	public String connect();
}

class Mouse implements USBport{

	@Override
	public String connect() {
		return String.format("%s와 연결되었습니다", Mouse.class.getName());
	}	
	
	
	
}

class KeyBoard implements USBport{

	@Override
	public String connect() {
		return String.format("%s와 연결되었습니다", KeyBoard.class.getName());
	}
	
}

class Monitor implements USBport{

	@Override
	public String connect() {
		return String.format("%s와 연결되었습니다", Monitor.class.getName());
	}
	
}

public class Quiz {
	
	// 문제>>>
	// 인터페이스를 활용한 다중상속으로 컴퓨터에 모니터, 마우스, 키보드를 USB로 연결하세요
	// 연결되었음을 객체 생성을 통해 출력하세요
	
	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		KeyBoard board = new KeyBoard();
		Monitor monitor = new Monitor();
		
		
		computer M_conn = new computer();
		M_conn.success(m);
		
		computer Key_conn = new computer();
		Key_conn.success(board);
		
		computer Monitor_conn = new computer();
		Monitor_conn.success(monitor);

		
	}
	
}
