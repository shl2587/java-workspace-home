package quiz_interface2;

public class Human implements Animal{
	
	private String name;
	
	Human(String name) {
		this.name = name;
	}

	@Override
	public String callName() {
		return null;
	}
	
	
}
