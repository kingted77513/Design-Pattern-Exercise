package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.VeggiePizza;

class VeggiePizzaTest {
	
	VeggiePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new VeggiePizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Veggie Pizza";
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
		sb.append("Prepare Veggie Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Shredded mozzarella");
		sb.append(System.lineSeparator());
		sb.append("   Grated parmesan");
		sb.append(System.lineSeparator());
		sb.append("   Diced onion");
		sb.append(System.lineSeparator());
		sb.append("   Sliced mushrooms");
		sb.append(System.lineSeparator());
		sb.append("   Sliced red pepper");
		sb.append(System.lineSeparator());
		sb.append("   Sliced black olives");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
