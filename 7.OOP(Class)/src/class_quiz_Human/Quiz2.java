package class_quiz_Human;

public class Quiz2 {
	public static void main(String[] args) {
		// 다음 메인함수 코드가 실행될 수 있도록 클래스를 구성하세요
		// 객체가 생성될 때마다, 전체 인원수가 1씩 증가하는 코드
		// 객체 인원수는 직접 대입할 수 없고, getter를 통해서 받아올 수 있도록 구성하세요
		
		
		String[] arr = new String[3];
		
		
		System.out.printf("전체 인원 수 : %d\n", Human.getPopulation());	// 전체 Human 객체의 개수가 출력되도록 해주세요(0)
		
		Human ob1 = new Human("김용민");
		Human ob2 = new Human("한승록");
		
		System.out.printf("전체 인원 수 : %d\n", Human.getPopulation());	// 전체 Human 객체의 개수가 추력되도록 해주세요(2)
		
		Human ob3 = new Human("유정현");
		
		System.out.printf("전체 인원 수 : %d\n", Human.getPopulation());	// 전체 Human 객체의 개수가 출력되도록 해주세요(3)
		
		String name = ob1.getName();
		arr[0] = name;
		name = ob2.getName();
		arr[1] = name;
		name = ob3.getName();
		arr[2] = name;
		System.out.println();
		
		
		System.out.print("전체 명단 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// ob1, ob2, ob3 에서 전체 인원수에 접근하여 출력해보세요
		
		System.out.printf("전체 인원 수 : %d\n", ob1.getPopulation());	
		System.out.printf("전체 인원 수 : %d\n", ob2.getPopulation());	
		System.out.printf("전체 인원 수 : %d\n", ob3.getPopulation());	
	}
}
