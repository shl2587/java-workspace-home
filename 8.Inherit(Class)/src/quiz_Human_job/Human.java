package quiz_Human_job;

public class Human {
	// main함수에서 입력받을 변수 name과 age 선언
	private String name;	
	private int age;
	
	
	// 상속을 위한 생성자 작성
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 상속을 확인하기 위한 메서드 작성
	public void introduce() {
		System.out.printf("%s의 나이는 %d세입니다.\n", name, age);
	}
	
	
	
	
	// private처리 되어 있으므로 getter/setter작성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
