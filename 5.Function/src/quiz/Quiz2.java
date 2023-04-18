package quiz;

import java.util.Arrays;

public class Quiz2 {
	public static void main(String[] args) {
		// 1) 전달받은 정수가 primeNumber인지 아닌지 판별하는 함수를 작성하세요
		System.out.printf("%d는 소수인가 : %s\n", 3, isPrimeNumber(3));
		System.out.printf("%d는 소수인가 : %s\n", 4, isPrimeNumber(4));
		
		// 2) 두 정수를 전달받아서, 두 정수 사이의 primeNumber로 구성된 배열을 반환하는 함수를 작성하세요
		int[] arr = getPrimeNumberArray(1, 1000);
		
		
		// 3) 1부터 1000사이의 소수로 구성된 정수 배열을 출력하세요
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// 4) 1부터 100까지 소수로 구성된 정수 배열의 크기
		int[] arr100 = getPrimeNumberArray(1, 100);
		System.out.println("소수로 구성된 정수 배열의 크기 = " + arr100.length);
		System.out.println();
		
		// 5) 배열의 내용을 문자열로 변환하여 한 줄당 10개씩만 출력하는 함수 (void)
		getTenPrint(arr);
		
	}
	
	// 1) 전달받은 정수가 primeNumber인지 아닌지 판별하는 함수를 작성하세요
	static boolean isPrimeNumber(int num) {	// main 함수에서 사용할 수 있도록 static 함수 선언
											// 소수인지 아닌지 판별하기위한 논리값 반환 boolean자료형
											// 소수인지 판별하기 위한 정수를 매개변수로 받음 
		int count = 0;						// 약수 개수를 세기 위한 count 변수 선언 및 0으로 초기화
		
		if (num == 1) return false;			// 매개변수 정수가 1이면 (소수가 아님) false를 반환
		
		for (int i = 1; i <= num; i++) {	// 지역 변수 i로 나누어 약수의 개수를 구하기 위한 제어문 작성 
			if (num % i == 0) {				// 매개변수를 i로 나누어 0이 되면 약수로 판단하기 위한 if 제어문
				count++;					// 위의 제어문을 통과하면 count를 증가
				if (count > 2) {			// count(약수의 개수)가 2개보다 많으면 소수가 아니므로
					return false;			// false를 반환
				}
			}
		}		
		return true;						// 이상 소수 조건을 모두 통과하게 되면 true를 반환
	}
	
	
	// 2) 두 정수를 전달받아서, 두 정수 사이의 primeNumber로 구성된 배열을 반환하는 함수를 작성하세요
	// 3) 1부터 1000사이의 소수로 구성된 정수 배열을 출력하세요
	// 4) 1부터 100까지 소수로 구성된 정수 배열의 크기
	static int[] getPrimeNumberArray(int start, int end) {	// main 함수에서 사용할 수 있도록 static 함수 선언
															// 배열을 반환하기 위한 int[] 자료형으로 작성													
															// 매개변수 start과 end를 통해 범위 통제
		int count = 0;							// 반환하기 위한 배열의 크기를 구하기 위해 count를 통해 소수의 개수 변수 선언 및 0으로 초기화 
		int idx = 0;							// 배열 인덱스를 제어하기 위한 idx변수 선언 및 0으로 초기화
		for (int i = start; i <= end; i++) {	// 지역 변수 i를 start 나누어 약수의 개수를 구하기 위한 제어문 작성 
			if (isPrimeNumber(i)) {				// isPrimeNumber 함수를 재사용하여 약수로 판단하기 위한 if 제어문
				count++;						// 해당 조건을 통과하면 count를 증가
			}
		}		
		int[] arr = new int[count];
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {				// isPrimeNumber 함수를 재사용하여 약수로 판단하기 위한 if 제어문
				arr[idx] = i;					// 해당 조건을 통과하면 count를 증가
				idx++;							// 다음 소수를 저장하기 위한 인덱스 증가
			}
		}
		return arr;						// 배열을 모두 저장하여 반환
	}
	
	// 5) 배열의 내용을 문자열로 변환하여 한 줄당 10개씩만 출력하는 함수 (void)
	static void getTenPrint(int[] arr) {			// main 함수에서 사용할 수 있도록 static 함수 선언
													// 값을 반환하지 않고 출력문 출력을 위한 void로 작성
													// 소수를 저장한 배열을 매개변수로 받음
		for (int i = 0; i < arr.length; i++) {		// 배열의 인덱스를 통제하기 위한 arr.length 미만으로 범위 설정
			if(i != 0 && i % 10 == 0) {				// 인덱스 0을 시작점으로 출력하기 위한 if 제어문 작성 
				System.out.println();				// 인덱스가 10의 배수일때 마다 줄바꿈 실행
			}
			System.out.printf("%3d ", arr[i]);		// 배열을 출력
		}
	}
	
}
