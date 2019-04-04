package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.HouseBlend;
import decorator.Whip;

class WhipTest {
	
	Beverage beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new HouseBlend();
		beverage = new Whip(beverage);
	}

	@Test
	void testGetDescription() {
		String expected = "House Blend Coffee, Whip";
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
