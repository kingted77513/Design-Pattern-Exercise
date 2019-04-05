package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ClamPizza;

class ClamPizzaTest {
	
	ClamPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new ClamPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Clam Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing Clam Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Clam Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting Clam Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Clam Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
