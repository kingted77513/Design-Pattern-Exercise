package factory.test.ny;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ny.NYStylePepperoniPizza;

class NYStylePepperoniPizzaTest {
	
	NYStylePepperoniPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new NYStylePepperoniPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "NY Style Pepperoni Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing NY Style Pepperoni Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking NY Style Pepperoni Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting NY Style Pepperoni Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing NY Style Pepperoni Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
