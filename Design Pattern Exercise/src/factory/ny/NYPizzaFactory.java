package factory.ny;

import factory.Pizza;
import factory.PizzaIngredientFactory;
import factory.SimplePizzaFactory;

public class NYPizzaFactory extends SimplePizzaFactory{

	public Pizza createPizza(String type) {
		PizzaIngredientFactory ingredientFactory =
				new NYPizzaIngredientFactory();
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza(ingredientFactory);
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza(ingredientFactory);
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza(ingredientFactory);
		}
		return pizza;
	}
}
