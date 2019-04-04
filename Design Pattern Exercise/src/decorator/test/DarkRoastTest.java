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
	
	@Test
	void testGetFullCondimentCost() {
		double expected = 1.54;
		addAllCondiment();
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}

	private void addAllCondiment() {
		beverage.setMilk();
		beverage.setSoy();
		beverage.setMocha();
		beverage.setWhip();
	}
	
	@Test
	void testGetFullCondimentDescription() {
		String expected = "Dark Roast Coffee, Milk, Mocha, Soy, Whip";
		addAllCondiment();
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}
}
