package iterator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iterator.MenuItem;

class MenuItemTest {
	
	MenuItem menu;

	@BeforeEach
	void setUp() throws Exception {
		menu = new MenuItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	}

	@Test
	void testGetName() {
		String excepted = "K&B's Pancake Breakfast";
		String actual = menu.getName();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetDescription() {
		String excepted = "Pancakes with scrambled eggs, and toast";
		String actual = menu.getDescription();
		assertEquals(excepted, actual);
	}

	@Test
	void testIsVegetarian() {
		boolean excepted = true;
		boolean actual = menu.isVegetarian();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testGetPrice() {
		double excepted = 2.99;
		double actual = menu.getPrice();
		assertEquals(excepted, actual);
	}
}
