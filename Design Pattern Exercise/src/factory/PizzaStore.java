package factory;

public class PizzaStore {
	protected SimplePizzaFactory factory;
	
	public PizzaStore() {
		factory = new SimplePizzaFactory(); 
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
