package quiz;

class Dog extends Animal{	//  
	
	private String name;
	private String dogFeed;
	
	Dog(String name, String dogFeed) {
		this.dogFeed = dogFeed;
		this.name = name;
	}
	
	@Override
	public String feed() {
		return String.format("%s가 강아지에게 %s(을)를 줍니다", name, dogFeed);
	}

	public String getDogFeed() {
		return dogFeed;
	}

	public void setDogFeed(String dogFeed) {
		this.dogFeed = dogFeed;
	}
	
	
	
}
