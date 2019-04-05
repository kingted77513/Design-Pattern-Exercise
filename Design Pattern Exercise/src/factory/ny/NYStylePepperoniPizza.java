package factory.ny;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public NYStylePepperoniPizza(PizzaIngredientFactory factory) {
		name = "NY Style Pepperoni Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		pepperoni = ingredientFactory.createPepperoni();
		return "Prepared " + name;
	}
}
