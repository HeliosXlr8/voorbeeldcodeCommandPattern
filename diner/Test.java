package diner;

public class Test {

	public static void main(String[] args) {
		
		Pasta pasta = new Pasta();
		Pasta pastaVeg = new Pasta("vegetarian");
		Fries fries = new Fries();
		Salad salad = new Salad();
		
		OrderPasta orderPasta = new OrderPasta(pasta);
		OrderPasta orderPastaVeg = new OrderPasta(pastaVeg);
		OrderFries orderFries = new OrderFries(fries);
		OrderSalad orderSalad = new OrderSalad(salad);
		
		Waiter waiter = new Waiter();
		
		waiter.addOrder(orderPasta);
		waiter.addOrder(orderFries);
		
		waiter.finishOrders();
		
		waiter.addOrder(orderPastaVeg);
		waiter.addOrder(orderSalad);
				
		waiter.finishOrders();
		
		waiter.history();
		
		waiter.addOrder(orderFries);
		
		waiter.finishOrders();
		
		waiter.history();

	}

}
