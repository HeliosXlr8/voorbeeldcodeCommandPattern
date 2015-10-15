package diner;

public class OrderSalad implements Command {
	Salad salad;
	
	public OrderSalad(Salad salad) {
		this.salad = salad;
	}

	public void execute() {
		salad.addLettuce();
		salad.addCucumber();
		salad.addTomatoes();
	}

	public void serve() {
		System.out.println("Served salad order\n");
	}
	
	
}
