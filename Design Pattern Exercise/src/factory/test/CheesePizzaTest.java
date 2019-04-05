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
	void testCookPizza() {
		String excepted = "Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing Cheese Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Cheese Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting Cheese Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Cheese Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
