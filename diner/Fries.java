package diner;

public class Fries {
	
	private String name;
	
	public Fries() {
		this.name = "Fries";
	}
	
	public Fries(String name) {
		this.name = "Fries " + name;
	}

	public void fryFries() {
		System.out.println(name + " are fried");
	}
	
}
