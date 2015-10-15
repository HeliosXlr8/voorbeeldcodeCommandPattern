package diner;

public class Salad {
	
	private String name;
	
	public Salad() {
		this.name = "Salad";
	}
	
	public Salad(String name) {
		this.name = "Salad " + name;
	}

	public void addLettuce() {
		System.out.println("Added lettuce to " + name);
	}
	
	public void addTomatoes() {
		System.out.println("Added tomatoes to " + name);
	}
	
	public void addCucumber() {
		System.out.println("Added cucumber to " + name);
	}
	
}
