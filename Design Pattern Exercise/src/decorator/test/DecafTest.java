package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.Decaf;

class DecafTest {
	
	Decaf beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new Decaf();
	}

	@Test
	void testGetDescription() {
		String expected = "Decaf Coffee";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 1.05;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetFullCondimentCost() {
		double expected = 1.6;
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
		String expected = "Decaf Coffee, Milk, Mocha, Soy, Whip";
		addAllCondiment();
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}
}
