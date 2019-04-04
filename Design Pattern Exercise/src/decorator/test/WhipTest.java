package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Whip;

class WhipTest {
	
	Whip beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new Whip();
	}

	@Test
	void testGetDescription() {
		String expected = ", Whip";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 0.1;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
