package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.PepperoniPizza;

class PepperoniPizzaTest {
	
	PepperoniPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new PepperoniPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Pepperoni Pizza";
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
		sb.append("Prepare Pepperoni Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Sliced Pepperoni");
		sb.append(System.lineSeparator());
		sb.append("   Sliced Onion");
		sb.append(System.lineSeparator());
		sb.append("   Grated parmesan cheese");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
