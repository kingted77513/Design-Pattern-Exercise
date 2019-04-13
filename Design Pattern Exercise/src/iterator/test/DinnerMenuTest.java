package iterator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iterator.DinerMenu;
import iterator.MenuItem;

class DinnerMenuTest {
	
	DinerMenu menus;

	@BeforeEach
	void setUp() throws Exception {
		menus = new DinerMenu();
	}

	@Test
	void testAllMenuCorrect() {
		MenuItem[] menuItems =  menus.getMenuItems();
		MenuItem menu;
		
		menu = menuItems[0];
		checkMenuCorrect(menu, 
				"Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		
		menu = menuItems[1];
		checkMenuCorrect(menu, 
				"BLT",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		
		menu = menuItems[2];
		checkMenuCorrect(menu, 
				"Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		
		menu = menuItems[3];
		checkMenuCorrect(menu, 
				"Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 3.05);
		
		menu = menuItems[4];
		checkMenuCorrect(menu, 
				"Steamed Veggies and Brown Rice",
				"Steamed vegetables over brown rice", true, 3.99);
		
		menu = menuItems[5];
		checkMenuCorrect(menu, 
				"Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89);
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
