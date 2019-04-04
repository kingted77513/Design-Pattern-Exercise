package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Soy;

class SoyTest {
	
	Soy beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new Soy();
	}

	@Test
	void testGetDescription() {
		String expected = ", Soy";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 0.15;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
