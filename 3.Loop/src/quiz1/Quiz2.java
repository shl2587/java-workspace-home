package quiz1;

public class Quiz2 {
	public static void main(String[] args) {
		// 첫날에 10원으로 시작하여 하루가 지날때 마다 2배씩 입금 금액을 늘려나간다
		// 이런 식으로 30일동안 입금했을때, 은행에 누적된 총 금액이 얼마인지 계산하여 출력하세요
		// 10, 20, 40, 80, 160 ...
		
		// int로 선언하면 범위를 초과
//		int money = 10;
//		int total = 0;		
		long money = 10;		// 2배씩 하여 30일간 하루하루의 금액을 저장해야하기 때문에 long으로 선언 및 10으로 초기화
		long total = 0;			// 해당 금액을 전부 더해야 하기때문에 저장범위 초과를 막기 위해 long으로 선언
		
		for (int i = 0; i < 30; i++) {	// 30일간의 기간을 통제
			money *= 2;					// 복합연산자를 이용하여 2배씩 누적으로 곱셈 진행	
			total += money;				// 곱셈된 금액을 누적하여 덧셈
		}
		
		System.out.printf("누적된 총 금액 : %,d원", total);	// 정수 서식 문자에 ,를 대입하여 1000단위로 찍어주면서 출력
								
	}
}
