package factory.test.ny;

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
		
		excepted = "Preparing NY Style Sauce and Cheese Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking NY Style Sauce and Cheese Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting NY Style Sauce and Cheese Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing NY Style Sauce and Cheese Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
