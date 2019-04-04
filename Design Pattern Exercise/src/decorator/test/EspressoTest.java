package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.Espresso;
import decorator.Milk;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

class EspressoTest {
	
	Beverage beverage;

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
	
	@Test
	void testGetFullCondimentCost() {
		double expected = 2.54;
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
		String expected = "Espresso, Milk, Soy, Mocha, Whip";
		addAllCondiment();
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}
}
