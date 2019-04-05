package factory.ny.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ny.NYStyleCheesePizza;

class NYStyleCheesePizzaTest {
	
	NYStyleCheesePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new NYStyleCheesePizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "NY Style Sauce and Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = getPrepareMessage();
		actual = pizza.prepare();
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
		sb.append("Prepare NY Style Sauce and Cheese Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Grated Reggiano Cheese");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
