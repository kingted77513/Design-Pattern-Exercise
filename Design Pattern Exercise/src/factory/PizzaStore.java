package factory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract protected Pizza createPizza(String type);
}
