package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.DarkRoast;
import decorator.Milk;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

class DarkRoastTest {
	
	Beverage beverage;

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
	
	@Test
	void testGetFullCondimentCost() {
		double expected = 1.54;
		addAllCondiment();
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}

	private void addAllCondiment() {
		beverage = new Milk(beverage);
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
	}
	
	@Test
	void testGetFullCondimentDescription() {
		String expected = "Dark Roast Coffee, Milk, Soy, Mocha, Whip";
		addAllCondiment();
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetDoubleFullCondimentCost() {
		double expected = 2.09;
		addAllCondiment();
		addAllCondiment();
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
}
