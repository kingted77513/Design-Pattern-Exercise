package factory.chicago;

import factory.Pizza;
import factory.PizzaIngredientFactory;
import factory.SimplePizzaFactory;

public class ChicagoPizzaFactory extends SimplePizzaFactory{

	public Pizza createPizza(String type) {
		PizzaIngredientFactory ingredientFactory =
				new ChicagoPizzaIngredientFactory();
		
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza(ingredientFactory);
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
		}
		return pizza;
	}
}
