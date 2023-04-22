package quiz;

public class Quiz1 {
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈
		int test1 = add(12, 23);
		int test2 = add(1234, 5678);
				
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);
				
		// 2) 두 정수를 전달받아서 큰 값을 반환하는 함수
		int test3 = bigNumber(12, 23);
		int test4 = bigNumber(1234 , -5678);
		
		System.out.println("test3 : " + test3);
		System.out.println("test4 : " + test4);
				
		// 3) 반지름을 전달받아서, 원의 면적을 double로 반환하는 함수
		double test5 = circleSize(3);
		double test6 = circleSize(3.5);
				
		System.out.println("test5 : " + test5);
		System.out.println("test6 : " + test6);
				
		// 4) 문자열의 길이를 정수로 반환하는 함수
		int test7 = len("안녕하세요");
		int test8 = len("Hello, world !!");
		System.out.println("test7 : " + test7);
		System.out.println("test8 : " + test8);
				
		// 5) 전달받은 정수가 짝수인지 아닌지 판별하는 함수 -> 'is'로 시작하게 작명하는 경우가 많음
		boolean test9 = isEvenNumber(9);
		boolean test10 = isEvenNumber(10);
		System.out.println("test9 : " + test9);
		System.out.println("test10 : " + test10);
	}
	
	// 1) 두 정수의 덧셈
	static int add(int num1, int num2) {	// static main에서 작동시키기 위한 static 메서드 작성
											// 정수를 받아 정수를 반환하기 때문에 자료형은 int
											// 값을 받아올 매개변수  int num1, int num2 선언
		return num1 + num2;					// 매개변수를 더하여 값을 반환
	}
	
	// 2) 두 정수를 전달받아서 큰 값을 반환하는 함수
	static int bigNumber(int num1, int num2) {	// static main에서 작동시키기 위한 static 메서드 작성
												// 정수를 받아 정수를 반환하기 때문에 자료형은 int
												// 값을 받아올 매개변수  int num1, int num2 선언
		return num1 > num2 ? num1 : num2;		// 삼항연산자를 통한 num1이 크면 num1을 num2가 크거나 같으면 num2를 반환
	}
	
	// 3) 반지름을 전달받아서, 원의 면적을 double로 반환하는 함수
	static double circleSize(double fnum) {		// static main에서 작동시키기 위한 static 메서드 작성
												// 실수를 받아 실수를 반환하기 때문에 자료형은 double
												// 원의 반지름값을 받아올 매개변수 double fnum
		return fnum *= 3.14; 					// 반지름을 곱셈 대입연산자를 통해 값을 반환(원의 면적을 구하는 식이 반지름의 제곱에 3.14를 곱함)
	}
	
	// 4) 문자열의 길이를 정수로 반환하는 함수
	static int len(String str) {				// static main에서 작동시키기 위한 static 메서드 작성
												// 문자열을 받아 정수를 반환하기 때문에 자료형은 int
												// 문자열을 받을 매개변수 String str을 선언
		return str.length();					// 길이를 구하는 메서드 length()를 활용하여 길이를 반환
	}
	
	// 5) 전달받은 정수가 짝수인지 아닌지 판별하는 함수 -> 'is'로 시작하게 작명하는 경우가 많음
	static boolean isEvenNumber(int num) {		// static main에서 작동시키기 위한 static 메서드 작성
												// 정수를 받아 논리값을 반환하기 때문에 자료형은 boolean
												// 정수를 전달 받을 매개변수 int num을 선언
		return (num % 2 == 0) ? true : false;	// 삼항 연산자를 통해 매개변수 num을 2로 나누어
												// - 나머지가 0이면 true(짝수)를 아니면 false(홀수)를 반환

	}
}
