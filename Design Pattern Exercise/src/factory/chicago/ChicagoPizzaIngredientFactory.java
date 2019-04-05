package factory.chicago;

import factory.PizzaIngredientFactory;
import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.MozzarellaCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FrozenClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThickCrustDough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.pepperoni.SlicedPepperoni;
import factory.ingredient.sauce.PlumTomatoSauce;
import factory.ingredient.sauce.Sauce;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
