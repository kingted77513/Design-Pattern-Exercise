package factory.ingredient.cheese.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.cheese.MozzarellaCheese;

class MozzarellaCheeseTest {

	MozzarellaCheese ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new MozzarellaCheese();
	}

	@Test
	void testGetDescription() {
		String expected = "Shredded Mozzarella";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
