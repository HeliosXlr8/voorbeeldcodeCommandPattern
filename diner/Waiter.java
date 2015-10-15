package diner;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Waiter {
	ArrayBlockingQueue<Command> orders;
	ArrayList<Command> finishedOrders;
	
	public Waiter() {
		orders = new ArrayBlockingQueue<>(100);
		finishedOrders = new ArrayList<>();
	}
	
	public void addOrder(Command order) {
		orders.add(order);
	}
	
	public void finishOrders() {
		Command order;
		while (!orders.isEmpty()) {
			try {
				order = orders.take();
				order.execute();
				order.serve();
				finishedOrders.add(order);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void history() {
		System.out.println("-------- TODAYS ORDERS --------");
		for (Command order : finishedOrders) {
			order.serve();
		}
		System.out.println("------------- END -------------");
	}
	
}
