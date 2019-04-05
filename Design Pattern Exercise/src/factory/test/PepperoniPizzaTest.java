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
		
		excepted = "Preparing Pepperoni Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Pepperoni Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting Pepperoni Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Pepperoni Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
