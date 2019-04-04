package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Mocha;

class MochaTest {
	
	Mocha beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new Mocha();
	}

	@Test
	void testGetDescription() {
		String expected = ", Mocha";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 0.2;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
