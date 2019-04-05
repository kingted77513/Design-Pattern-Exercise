package factory.test.chicago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.chicago.ChicagoStyleClamPizza;

class ChicagoStyleClamPizzaTest {
	
	ChicagoStyleClamPizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		pizza = new ChicagoStyleClamPizza();
	}

	@Test
	void testCookPizza() {
		String excepted = "Chicago Style Clam Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
		
		excepted = "Preparing Chicago Style Clam Pizza";
		actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Baking Chicago Style Clam Pizza";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Boxing Chicago Style Clam Pizza";
		actual = pizza.box();
		assertEquals(excepted, actual);
	}

}
