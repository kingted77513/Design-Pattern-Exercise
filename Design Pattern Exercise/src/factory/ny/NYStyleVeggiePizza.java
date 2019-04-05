package factory.ny;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class NYStyleVeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public NYStyleVeggiePizza(PizzaIngredientFactory factory) {
		name = "NY Style Veggie Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		return "Prepared " + name;
	}
}
