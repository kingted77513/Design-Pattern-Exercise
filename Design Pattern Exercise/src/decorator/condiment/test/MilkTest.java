package decorator.condiment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.HouseBlend;
import decorator.condiment.Milk;

class MilkTest {
	
	Beverage beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new HouseBlend();
		beverage = new Milk(beverage);
	}

	@Test
	void testGetDescription() {
		String expected = "House Blend Coffee, Milk";
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
