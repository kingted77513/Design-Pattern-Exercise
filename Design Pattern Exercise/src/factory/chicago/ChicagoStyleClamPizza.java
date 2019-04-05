package factory.chicago;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStyleClamPizza(PizzaIngredientFactory factory) {
		name = "Chicago Style Clam Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		return "Prepared " + name;
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
