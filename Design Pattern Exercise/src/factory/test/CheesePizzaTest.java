package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.CheesePizza;

class CheesePizzaTest {
	
	CheesePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new CheesePizza();
	}
	
	@Test
	void testGetPizzaInformation() {
		String excepted = "Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = getPizzaDescription();
		actual = pizza.getDescription();
		assertEquals(excepted, actual);
	}
	
	private String getPizzaDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("---- Cheese Pizza ----");
		sb.append(System.lineSeparator());
		sb.append("Dough: Regular Crust");
		sb.append(System.lineSeparator());
		sb.append("Sauce: Marinara Pizza Sauce");
		sb.append(System.lineSeparator());
		addToppingInformation(sb);
		
		String excepted = sb.toString();
		return excepted;
	}
	
	private void addToppingInformation(StringBuilder sb) {
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Fresh Mozzarella");
		sb.append(System.lineSeparator());
		sb.append("   Parmesan");
		sb.append(System.lineSeparator());
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
		sb.append("Prepare Cheese Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		addToppingInformation(sb);
		
		String excepted = sb.toString();
		return excepted;
	}
}
