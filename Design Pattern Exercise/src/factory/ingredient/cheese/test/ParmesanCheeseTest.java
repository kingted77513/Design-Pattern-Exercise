package factory.ingredient.cheese.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.cheese.ReggianoCheese;

class ParmesanCheeseTest {

	ReggianoCheese ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new ReggianoCheese();
	}

	@Test
	void testGetDescription() {
		String expected = "Reggiano Cheese";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
