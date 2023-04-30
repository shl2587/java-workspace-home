package quiz;

public class Cat extends Animal{

	private String name;
	private String catFeed;
	
	
	Cat(String name, String catFeed) {
		this.catFeed = catFeed;
		this.name = name;
	}
	
	@Override
	public String feed() {
		return String.format("%s가 고양이에게 %s(을)를 줍니다", name, catFeed);
	}

	public String getCatFeed() {
		return catFeed;
	}

	public void setCatFeed(String catFeed) {
		this.catFeed = catFeed;
	}
	
	
	
}
