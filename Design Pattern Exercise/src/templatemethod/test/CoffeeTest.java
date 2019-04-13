package templatemethod.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import templatemethod.Coffee;

class CoffeeTest {
	
	Coffee coffee;

	@BeforeEach
	void setUp() throws Exception {
		coffee = new Coffee();
	}

	@Test
	void testBoilWater() {
		String excepted = "Boiling water";
		String actual = coffee.boilWater();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testBrewCoffeeGrinds() {
		String excepted = "Dripping Coffee through filter";
		String actual = coffee.brewCoffeeGrinds();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testPourInCup() {
		String excepted = "Pouring into cup";
		String actual = coffee.pourInCup();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testAddSugarAndMilk() {
		String excepted = "Adding Sugar and Milk";
		String actual = coffee.addSugarAndMilk();
		assertEquals(excepted, actual);
	}
}
