package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ChicagoStyleVeggiePizza;

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
		
		excepted = "Preparing Chicago Deep Dish Veggie Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Chicago Deep Dish Veggie Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Chicago Deep Dish Veggie Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
