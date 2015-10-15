package diner;

public class OrderPasta implements Command {
	Pasta pasta;
	
	public OrderPasta(Pasta pasta) {
		this.pasta = pasta;
	}

	public void execute() {
		pasta.kookSpaghetti();
		pasta.makeSauce();
	}

	public void serve() {
		System.out.println("Served pasta order\n");
	}
	
	
}
