package iterator.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		ArrayList<MenuItem> menuItems =  menus.getMenuItems();
		MenuItem menu;
		
		menu = menuItems.get(0);
		checkMenuCorrect(menu, 
				"K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		
		menu = menuItems.get(1);
		checkMenuCorrect(menu, 
				"Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
		
		menu = menuItems.get(2);
		checkMenuCorrect(menu, 
				"Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
		
		menu = menuItems.get(3);
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
