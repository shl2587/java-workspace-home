package quiz;

import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		// 1) 정수형 배열 arr1을 생성하고 12, 91, 52, 34, 76, 29, 82를 넣어주세요
		int[] arr1 = { 12, 91, 52, 34, 76, 29, 82 };	// 배열 선언 및 요소 삽입
		
		
		// 2) arr1의 홀수번째 index에 들어간 숫자의 합을 구하여 출력하세요
		int sum1 = 0; 		// 홀수번째 index 요소의 합을 저장할 정수형 sum변수 선언
		for (int i = 1; i < arr1.length; i+=2) {	// index를 1부터 시작하여 2씩 더하며 홀수 인덱스만 통제
			sum1 += arr1[i];	// 홀수번째 index 요소의 누적 합을 sum1에 저장
		}
		System.out.println("홀수번째 [index]요소의 합 : " + sum1);	// 저장된 sum1 출력
		System.out.println();
		
		
		// 3) arr1의 짝수번째 index에 들어간 숫자에 10을 더하세요
		
		for (int i = 0; i < arr1.length; i += 2) {	// 0부터 2씩 증가하는 짝수 index 통제를 위한 제어문 작성
													// (프로그램 언어에서는 0을 짝수취급함을 주의!!!)
			arr1[i] += 10;		// 복합대입연산자를 이용한 짝수번째 index의 요소에 10을 더한 값을 저장
			// 해당 인덱스와 요소의 값을 서식문자를 통해 출력
			System.out.printf("짝수번째 [%d] 요소에 10을 더한 값 : %d\n", i, arr1[i]);
		}
		System.out.println();
		
		
		// 4) arr1.과 길이가 같은 정수형 배열 arr2를 새로 생성하세요
		
		// arr2를 생성하면서 크기를 입력해주고 arr1.length로 arr1과 같은 크기를 삽입
		int[] arr2 = new int[arr1.length];
		
		// 5) arr1에 담긴 값들을 역순으로 arr2에 담아주세요
		int index = 0;	// arr2의 index를 통제하기 위한 index 정수 변수 선언 및 0으로 초기화
		for (int i = arr1.length - 1; i != -1; i--) {	// arr1의 인덱스를 역순으로 통제하기 위한 제어문 작성
			arr2[index] = arr1[i];						// arr2의 정배열 인덱스에 arr1의 역순 인덱스로 요소를 삽입
			System.out.printf("arr1[%d] : %d, arr2[%d] : %d\n", 
					i, arr1[i], index, arr2[index]);	// 비교를 위해 arr1의 역순과 arr2의 정배열 요소를 같은 줄에 출력
			index++;	// 인덱스 제어를 위한 index 증감식
		}
		System.out.println();
		
		// 6) arr1과 arr2를 각각 한줄에 출력하세요
		System.out.println("arr1 : " + Arrays.toString(arr1));	// Object에서 Arrays 클래스에 상속되어 있는 
		System.out.println("arr2 : " + Arrays.toString(arr2));	// toString함수를 이용하여 배열 출력
	}
}
