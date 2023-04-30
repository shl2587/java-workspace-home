package quiz;

public class Main {
	public static void main(String[] args) {
		
		// 문제 >>
		// 추상화를 활용한 애완동물 간식주기
		
		Human human = new Human("철수");
		
		
		Cat catFeed = new Cat(human.getName(), "츄르");
		Dog dogFeed = new Dog(human.getName(), "개껌");
		System.out.println();
		
		
		
		System.out.println(catFeed.feed());
		System.out.println(dogFeed.feed());
	}
}
