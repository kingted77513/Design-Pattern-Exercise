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
		
		excepted = "Preparing Veggie Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Veggie Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting Veggie Pizza";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Veggie Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
