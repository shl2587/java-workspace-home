package quiz_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Coffee implements Comparable<Coffee>{	// Comparable을 상속받은 Coffe 클래스 생성
	String name;		// 커피 이름
	int price;			// 커피 금액
	
	public Coffee(String name, int price) {	// 클래스 생성자에 이름과 금액을 매개변수로 설정
		this.name = name;		// 멤버 필드에 이름을 저장
		this.price = price;		// 멤버 필드에 가격을 저장
	}
	
	@Override	// toString 오버라이딩
	public String toString() {
		return String.format("%s : %,d", name, price);	// String.format으로 메뉴 이름, 가격 출력문 반환
	}
	
	@Override							// 오버라이딩한 compareTo를
	public int compareTo(Coffee o) {	// 오름차순 정렬을 금액기준으로 설정하여
		return this.price - o.price;
	}
}
public class Comparable_Quiz {
	public static void main(String[] args) {
		
				// 문제 >>>
				// 다섯개의 서로다른 Coffe객체를 이름순으로 오름차순과 내림차순으로 정렬하세요
		
		
		
		
				Coffee ob1 = new Coffee("아메리카노", 2000);
				Coffee ob2 = new Coffee("디카페인 아메리카노", 2300);
				Coffee ob3 = new Coffee("헤이즐넛 아메리카노", 2500);
				Coffee ob4 = new Coffee("콜드브루 라떼", 4000);
				Coffee ob5 = new Coffee("콜드브루 돌체라떼", 4500);
				
				// 배열에 무작위로 저장
				Coffee[] arr = { ob4, ob1, ob3, ob5, ob2 };
				
				// Coffee클래스를 제네릭으로 하는 ArrayList 선언
				ArrayList<Coffee> list = new ArrayList<Coffee>(Arrays.asList(arr));
				list.forEach(c -> System.out.println(c));	// forEach문으로 해당 list 객체의 내용을 출력
															// 순서가 그대로 출력되는지 확인
				System.out.println();
				
				
				list.sort(null);	// Comparator는 전달하지 않았음
									// - 따라서 기본값으로 오름차순 정렬됨
				list.forEach(c -> System.out.println(c));	// forEach문으로 해당 list 객체를 출력
															// 정렬이 수행되는지 확인
				System.out.println();
				
				// Comparable에서 지정한 방식이 아닌, 다른 형태로 정렬을 수행하려면 Comparator를 사용한다
				Comparator<Coffee> comp = new Comparator<Coffee>() {
					
					
					@Override
					public int compare(Coffee o1, Coffee o2) {
						return o1.name.compareTo(o2.name);	// 이름을 기준으로 오름차순 정렬
					}
				};
				
				list.sort(comp);	// comp는 이름 기준 오름차순 정렬의 규칙이다
				list.forEach(c -> System.out.println(c));	// 이름 기준 오름차순 출력 확인
				System.out.println();
				
				// 람다식을 통하여 내림차순 Comparator 인터페이스를 생성
				Comparator<Coffee> comp2 = (o1, o2) -> o2.name.compareTo(o1.name);
				
				list.sort(comp2);	// comp2는 이름 기준 내림차순 정렬의 규칙
				list.forEach(c -> System.out.println(c));
				System.out.println();

			}
			
		}

