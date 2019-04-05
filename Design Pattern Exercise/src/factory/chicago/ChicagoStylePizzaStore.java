package factory.chicago;

import factory.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
	public ChicagoStylePizzaStore() {
		factory = new ChicagoPizzaFactory(); 
	}
}
