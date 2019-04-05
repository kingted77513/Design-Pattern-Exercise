package factory.ny;

import factory.Pizza;
import factory.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
	public NYStylePizzaStore() {
		factory = new NYPizzaFactory(); 
	}

	@Override
	protected Pizza createPizza(String type) {
		return factory.createPizza(type);
	}
}
