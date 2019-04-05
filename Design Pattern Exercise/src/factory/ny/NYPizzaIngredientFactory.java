package factory.ny;

import factory.PizzaIngredientFactory;
import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.ReggianoCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FreshClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThinCrustDough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.pepperoni.SlicedPepperoni;
import factory.ingredient.sauce.MarinaraSauce;
import factory.ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
