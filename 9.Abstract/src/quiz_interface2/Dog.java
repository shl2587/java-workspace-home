package quiz_interface2;

public class Dog implements Animal{
	
	private String name;
	
	Dog(String name) {
		this.name = name;
	}

	@Override
	public String callName() {
		return null;
	}
	
	@Override
	public void feed() {
		System.out.println("");
	}

}
