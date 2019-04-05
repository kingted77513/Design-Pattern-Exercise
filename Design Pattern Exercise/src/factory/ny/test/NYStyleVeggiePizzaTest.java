package factory.ny.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ny.NYStyleVeggiePizza;

class NYStyleVeggiePizzaTest {
	
	NYStyleVeggiePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new NYStyleVeggiePizza();
	}
	
	@Test
	void testGetPizzaInformation() {
		String excepted = "NY Style Veggie Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = getPizzaDescription();
		actual = pizza.getDescription();
		assertEquals(excepted, actual);
	}
	
	private String getPizzaDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("---- NY Style Veggie Pizza ----");
		sb.append(System.lineSeparator());
		sb.append("Dough: Thin Crust Dough");
		sb.append(System.lineSeparator());
		sb.append("Sauce: Marinara Sauce");
		sb.append(System.lineSeparator());
		addToppingInformation(sb);
		
		String excepted = sb.toString();
		return excepted;
	}

	@Test
	void testCookPizza() {
		String excepted = getPrepareMessage();
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
	}

	private String getPrepareMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prepare NY Style Veggie Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		addToppingInformation(sb);
		
		String excepted = sb.toString();
		return excepted;
	}

	private void addToppingInformation(StringBuilder sb) {
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Grated Reggiano Cheese");
		sb.append(System.lineSeparator());
		sb.append("   Garlic");
		sb.append(System.lineSeparator());
		sb.append("   Onion");
		sb.append(System.lineSeparator());
		sb.append("   Mushrooms");
		sb.append(System.lineSeparator());
		sb.append("   Red Pepper");
		sb.append(System.lineSeparator());
	}
}
