package factory.ny;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class NYStyleClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public NYStyleClamPizza(PizzaIngredientFactory factory) {
		name = "NY Style Clam Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		return "Prepared " + name;
	}
}
