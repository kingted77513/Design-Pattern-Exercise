package factory.ingredient.cheese.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.cheese.ParmesanCheese;

class ReggianoCheeseTest {

	ParmesanCheese ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new ParmesanCheese();
	}

	@Test
	void testGetDescription() {
		String expected = "Shredded Parmesan";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
