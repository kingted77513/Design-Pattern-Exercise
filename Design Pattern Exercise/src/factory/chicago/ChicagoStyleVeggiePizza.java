package factory.chicago;

import factory.Pizza;
import factory.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStyleVeggiePizza(PizzaIngredientFactory factory) {
		name = "Chicago Deep Dish Veggie Pizza";
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
