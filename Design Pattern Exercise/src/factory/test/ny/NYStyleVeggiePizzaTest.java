package factory.test.ny;

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
	void testCookPizza() {
		String excepted = "NY Style Veggie Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing NY Style Veggie Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking NY Style Veggie Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting NY Style Veggie Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing NY Style Veggie Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
