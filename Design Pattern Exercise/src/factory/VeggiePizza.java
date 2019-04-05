package factory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory factory) {
		name = "Veggie Pizza";
		ingredientFactory = factory;
	}
	
	public String prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		return "Prepared " + name;
	}
}
