package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.DarkRoast;

class DarkRoastTest {
	
	DarkRoast beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new DarkRoast();
	}

	@Test
	void testGetDescription() {
		String expected = "Dark Roast Coffee";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 0.99;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
