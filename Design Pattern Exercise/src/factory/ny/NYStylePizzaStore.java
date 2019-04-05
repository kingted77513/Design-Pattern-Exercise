package factory.ny;

import factory.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
	public NYStylePizzaStore() {
		factory = new NYPizzaFactory(); 
	}
}
