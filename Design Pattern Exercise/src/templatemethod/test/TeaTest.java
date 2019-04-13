package templatemethod.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import templatemethod.Tea;

class TeaTest {
	
	Tea tea;

	@BeforeEach
	void setUp() throws Exception {
		tea = new Tea();
	}

	@Test
	void testBoilWater() {
		String excepted = "Boiling water";
		String actual = tea.boilWater();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testBrew() {
		String excepted = "Steeping the tea";
		String actual = tea.brew();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testAddCondiments() {
		String excepted = "Adding Lemon";
		String actual = tea.addCondiments();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testPourInCup() {
		String excepted = "Pouring into cup";
		String actual = tea.pourInCup();
		assertEquals(excepted, actual);
	}
}
