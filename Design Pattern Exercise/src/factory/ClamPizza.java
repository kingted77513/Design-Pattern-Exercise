package factory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory factory) {
		name = "Clam Pizza";
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
