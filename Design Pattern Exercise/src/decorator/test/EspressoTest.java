package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Espresso;

class EspressoTest {
	
	Espresso beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new Espresso();
	}

	@Test
	void testGetDescription() {
		String expected = "Espresso";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 1.99;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
