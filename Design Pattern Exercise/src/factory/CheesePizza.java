package factory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory factory) {
		name = "Cheese Pizza";
		ingredientFactory = factory;
	}
 
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		return "Prepared " + name;
	}
}