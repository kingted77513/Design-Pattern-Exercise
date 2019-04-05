package factory.chicago.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.chicago.ChicagoPizzaIngredientFactory;
import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;

class ChicagoPizzaIngredientFactoryTest {
	
	ChicagoPizzaIngredientFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new ChicagoPizzaIngredientFactory();
	}

	@Test
	void testGetCheeseIngredient() {
		String excepted = "Shredded Mozzarella";
		
		Cheese ingredient = factory.createCheese();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetDoughIngredient() {
		String excepted = "ThickCrust style extra thick crust dough";
		
		Dough ingredient = factory.createDough();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetSauceIngredient() {
		String excepted = "Tomato sauce with plum tomatoes";
		
		Sauce ingredient = factory.createSauce();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetPepperoniIngredient() {
		String excepted = "Sliced Pepperoni";
		
		Pepperoni ingredient = factory.createPepperoni();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetClamIngredient() {
		String excepted = "Frozen Clams from Chesapeake Bay";
		
		Clams ingredient = factory.createClam();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
}
