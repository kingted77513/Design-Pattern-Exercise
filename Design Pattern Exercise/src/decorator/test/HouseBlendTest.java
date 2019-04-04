package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decorator.HouseBlend;

class HouseBlendTest {
	
	HouseBlend beverage;

	@BeforeEach
	void setUp() throws Exception {
		beverage = new HouseBlend();
	}

	@Test
	void testGetDescription() {
		String expected = "House Blend Coffee";
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCost() {
		double expected = 0.89;
		double actual = beverage.cost();
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetFullCondimentCost() {
		double expected = 1.44;
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
		String expected = "House Blend Coffee, Milk, Mocha, Soy, Whip";
		addAllCondiment();
		String actual = beverage.getDescription();
		assertEquals(expected, actual);
	}
}
