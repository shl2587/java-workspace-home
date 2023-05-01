package quiz_interface;

class computer {
	public void success(USBport port) {
		// computer 클래스와의 상호작용을 위해 매개변수로 USBport 자료형의 객체 받음
		System.out.println(port.connect());	// 상속을 이용한 connect메서드 호출
	}
}

interface USBport {	// 다중 상속을 위해 인터페이스 추상 클래스 USBport생성
		
	public String connect();	// 미완성 메서드 생성
}

class Mouse implements USBport{		// implement로 Mouse 클래스에 상속

	@Override
	public String connect() {
		// 오버라이딩을 통한 메서드 내용 삽입(%s를 통해 Mouse클래스 이름 format시켜 반환)
		return String.format("%s와 연결되었습니다", Mouse.class.getName());
	}	
	
	
	
}

class KeyBoard implements USBport{	// implement로 KeyBoard 클래스에 상속

	@Override
	public String connect() {
		// 오버라이딩을 통한 메서드 내용 삽입(%s를 통해 Mouse클래스 이름 format시켜 반환)
		return String.format("%s와 연결되었습니다", KeyBoard.class.getName());
	}
	
}

class Monitor implements USBport{	// implement로 Monitor 클래스에 상속

	@Override
	public String connect() {
		// 오버라이딩을 통한 메서드 내용 삽입(%s를 통해 Mouse클래스 이름 format시켜 반환)
		return String.format("%s와 연결되었습니다", Monitor.class.getName());
	}
	
}

public class Quiz {
	
	// 문제>>>
	// 인터페이스를 활용한 다중상속으로 컴퓨터에 모니터, 마우스, 키보드를 USB로 연결하세요
	// 연결되었음을 객체 생성을 통해 출력하세요
	
	public static void main(String[] args) {
		
		// computer객체 전달하기 위한 마우스, 키보드, 모니터 각각의 객체 생성
		Mouse m = new Mouse();
		KeyBoard board = new KeyBoard();
		Monitor monitor = new Monitor();
		
		// 출력을 위해 computer클래스 객체생성 후
		// - 위에서 생성한 객체들을 매개변수로 전달(상속받았기 때문에 USBport 자료형으로 업캐스팅 가능)
		computer M_conn = new computer();
		M_conn.success(m);
		
		computer Key_conn = new computer();
		Key_conn.success(board);
		
		computer Monitor_conn = new computer();
		Monitor_conn.success(monitor);

		
	}
	
}
