package factory.chicago;

import factory.Pizza;
import factory.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
	ChicagoPizzaFactory factory;
	
	public ChicagoStylePizzaStore() {
		factory = new ChicagoPizzaFactory(); 
	}

	@Override
	protected Pizza createPizza(String type) {
		return factory.createPizza(type);
	}
}
