package factory.test.chicago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.chicago.ChicagoStyleCheesePizza;

class ChicagoStyleCheesePizzaTest {
	
	ChicagoStyleCheesePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new ChicagoStyleCheesePizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Chicago Style Deep Dish Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing Chicago Style Deep Dish Cheese Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Chicago Style Deep Dish Cheese Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Chicago Style Deep Dish Cheese Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
