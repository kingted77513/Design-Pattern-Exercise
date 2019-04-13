package iterator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import iterator.MenuItem;
import iterator.PancakeHouseMenu;

class PancakeHouseMenuTest {
	
	PancakeHouseMenu menus;

	@BeforeEach
	void setUp() throws Exception {
		menus = new PancakeHouseMenu();
	}

	@Test
	void testAllMenuCorrect() {
		Iterator<MenuItem> iterator=  menus.createIterator();
		MenuItem menu;
		
		menu = iterator.next();
		checkMenuCorrect(menu, 
				"K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		
		menu = iterator.next();
		checkMenuCorrect(menu, 
				"Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
		
		menu = iterator.next();
		checkMenuCorrect(menu, 
				"Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
		
		menu = iterator.next();
		checkMenuCorrect(menu, 
				"Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}
	
	private void checkMenuCorrect(MenuItem menu, 
			String name, 
            String description, 
            boolean vegetarian, 
            double price) {
		assertEquals(name, menu.getName());
		assertEquals(description, menu.getDescription());
		assertEquals(vegetarian, menu.isVegetarian());
		assertEquals(price, menu.getPrice());
	}

}
