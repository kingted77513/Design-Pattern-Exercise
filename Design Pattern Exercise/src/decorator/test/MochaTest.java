package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.HouseBlend;
import decorator.Mocha;

class MochaTest {
	
	Beverage beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new HouseBlend();
		beverage = new Mocha(beverage);
	}

	@Test
	void testGetDescription() {
		String expected = "House Blend Coffee, Mocha";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 1.09;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
