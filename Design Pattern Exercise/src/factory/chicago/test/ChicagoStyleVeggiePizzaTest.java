package factory.chicago.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.chicago.ChicagoStyleVeggiePizza;

class ChicagoStyleVeggiePizzaTest {
	
	ChicagoStyleVeggiePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new ChicagoStyleVeggiePizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Chicago Deep Dish Veggie Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = getPrepareMessage();
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Bake for 25 minutes at 350";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Place pizza in official PizzaStore box";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

	private String getPrepareMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prepare Chicago Deep Dish Veggie Pizza");
		sb.append(System.lineSeparator());
		sb.append("Tossing dough...");
		sb.append(System.lineSeparator());
		sb.append("Adding sauce...");
		sb.append(System.lineSeparator());
		sb.append("Adding toppings: ");
		sb.append(System.lineSeparator());
		sb.append("   Shredded Mozzarella Cheese");
		sb.append(System.lineSeparator());
		sb.append("   Black Olives");
		sb.append(System.lineSeparator());
		sb.append("   Spinach");
		sb.append(System.lineSeparator());
		sb.append("   Eggplant");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
