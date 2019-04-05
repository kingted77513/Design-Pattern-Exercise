package factory.ny;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public NYStyleCheesePizza(PizzaIngredientFactory factory) { 
		name = "NY Style Sauce and Cheese Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		return "Prepared " + name;
	}
}
