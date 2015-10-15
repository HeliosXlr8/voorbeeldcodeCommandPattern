package diner;

public class OrderFries implements Command {
	Fries fries;
	
	public OrderFries(Fries fries) {
		this.fries = fries;
	}

	public void execute() {
		fries.fryFries();
	}

	public void serve() {
		System.out.println("Served fries order\n");
	}
	
	
}
