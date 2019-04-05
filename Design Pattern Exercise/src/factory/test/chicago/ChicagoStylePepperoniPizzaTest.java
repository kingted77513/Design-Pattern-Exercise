package factory.test.chicago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.chicago.ChicagoStylePepperoniPizza;

class ChicagoStylePepperoniPizzaTest {
	
	ChicagoStylePepperoniPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new ChicagoStylePepperoniPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Chicago Style Pepperoni Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing Chicago Style Pepperoni Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Chicago Style Pepperoni Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Chicago Style Pepperoni Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
