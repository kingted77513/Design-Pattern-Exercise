package factory.chicago;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStylePepperoniPizza(PizzaIngredientFactory factory) {
		name = "Chicago Style Pepperoni Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPepperoni();
		return "Prepared " + name;
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
