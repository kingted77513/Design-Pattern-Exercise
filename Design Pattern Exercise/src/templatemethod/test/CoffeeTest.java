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
	void testBrew() {
		String excepted = "Dripping Coffee through filter";
		String actual = coffee.brew();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testPourInCup() {
		String excepted = "Pouring into cup";
		String actual = coffee.pourInCup();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testAddCondiments() {
		String excepted = "Adding Sugar and Milk";
		String actual = coffee.addCondiments();
		assertEquals(excepted, actual);
	}
}
