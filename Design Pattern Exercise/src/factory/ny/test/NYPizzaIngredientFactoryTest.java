package factory.ny.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;
import factory.ny.NYPizzaIngredientFactory;

class NYPizzaIngredientFactoryTest {
	
	NYPizzaIngredientFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new NYPizzaIngredientFactory();
	}

	@Test
	void testGetCheeseIngredient() {
		String excepted = "Reggiano Cheese";
		
		Cheese ingredient = factory.createCheese();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetDoughIngredient() {
		String excepted = "Thin Crust Dough";
		
		Dough ingredient = factory.createDough();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetSauceIngredient() {
		String excepted = "Marinara Sauce";
		
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
		String excepted = "Fresh Clams from Long Island Sound";
		
		Clams ingredient = factory.createClam();
		String actual = ingredient.getDescription();
		
		assertEquals(excepted, actual);
	}
}
