package diner;

public class Pasta {
	
	private String name;
	
	public Pasta() {
		this.name = "Pasta";
	}
	
	public Pasta(String name) {
		this.name = "Pasta " + name;
	}

	public void kookSpaghetti() {
		System.out.println(name + " is kooked");
	}
	
	public void makeSauce() {
		System.out.println("Made "+ name +" sauce");
	}
	
}
