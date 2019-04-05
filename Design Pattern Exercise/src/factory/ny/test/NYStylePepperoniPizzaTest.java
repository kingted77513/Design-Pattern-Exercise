package factory.ny.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.PizzaIngredientFactory;
import factory.ny.NYPizzaIngredientFactory;
import factory.ny.NYStylePepperoniPizza;

class NYStylePepperoniPizzaTest {
	
	NYStylePepperoniPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		PizzaIngredientFactory ingredientFactory =
				new NYPizzaIngredientFactory();
		pizza = new NYStylePepperoniPizza(ingredientFactory);
	}
	
	@Test
	void testGetPizzaInformation() {
		String excepted = "NY Style Pepperoni Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
	}

	@Test
	void testCookPizza() {
		String excepted = "Prepared NY Style Pepperoni Pizza";
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
		sb.append("---- NY Style Pepperoni Pizza ----");
		sb.append(System.lineSeparator());
		sb.append("Dough: Thin Crust Dough");
		sb.append(System.lineSeparator());
		sb.append("Sauce: Marinara Sauce");
		sb.append(System.lineSeparator());
		sb.append("Cheese: Reggiano Cheese");
		sb.append(System.lineSeparator());
		sb.append("Clams: Fresh Clams from Long Island Sound");
		sb.append(System.lineSeparator());
		sb.append("Pepperoni: Sliced Pepperoni");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
