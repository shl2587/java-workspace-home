package quiz_interface2;

import java.util.Scanner;

// 문제 >>
// 철수와 영희는 친구입니다.
// 철수는 강아지를 영희는 고양이를 키웁니다
// 자신의 애완동물에게 먹이를 줄때는 이름을 상대방의 애완동물에게 먹이를 줄때는 친구로 나타나도록 하세요
// (고양이는 츄르를 강아지는 개껌을 먹습니다)
// (인터페이스와 상속 모두를 활용하여 문제를 해결하세요)

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dogName, catName, manName="철수", friendName="영희";
		
		System.out.print("강아지 이름 입력 : ");
		dogName = sc.nextLine();
		
		System.out.print("고양이 이름 입력 : ");
		catName = sc.nextLine();
		
		Animal dog = new Dog(dogName);
		Animal cat = new Cat(catName);
		
		Human hm = new Human(manName);
		Human fr = new Friend(friendName);
		
		System.out.println(hm.give(dog));
		System.out.println(fr.give(cat));
		
		Human hmfr = new Human(manName);
		System.out.println(hmfr.give(cat));
		
		
		
		sc.close();
	}
	
	
	
	
	
}
