package factory.chicago;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		return "Prepared " + name;
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
