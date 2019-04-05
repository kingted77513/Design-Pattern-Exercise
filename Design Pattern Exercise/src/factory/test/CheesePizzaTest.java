package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.CheesePizza;
import factory.ny.NYPizzaIngredientFactory;

class CheesePizzaTest {
	
	CheesePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		NYPizzaIngredientFactory factory
			= new NYPizzaIngredientFactory();
		pizza = new CheesePizza(factory);
	}
	
	@Test
	void testGetPizzaInformation() {
		String excepted = "Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
	}

	@Test
	void testCookPizza() {
		String excepted = "Prepared Cheese Pizza";
		String actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Bake for 25 minutes at 350";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cut the pizza into diagonal slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Place pizza in official PizzaStore box";
		actual = pizza.box();
		assertEquals(excepted, actual);
		
		excepted = getPizzaDescription();
		actual = pizza.getDescription();
		assertEquals(excepted, actual);
	}
	
	private String getPizzaDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("---- Cheese Pizza ----");
		sb.append(System.lineSeparator());
		sb.append("Dough: Thin Crust Dough");
		sb.append(System.lineSeparator());
		sb.append("Sauce: Marinara Sauce");
		sb.append(System.lineSeparator());
		sb.append("Cheese: Reggiano Cheese");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
