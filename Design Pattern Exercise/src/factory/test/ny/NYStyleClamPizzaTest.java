package factory.test.ny;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ny.NYStyleClamPizza;

class NYStyleClamPizzaTest {
	
	NYStyleClamPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new NYStyleClamPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "NY Style Clam Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing NY Style Clam Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking NY Style Clam Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting NY Style Clam Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing NY Style Clam Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}