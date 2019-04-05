package factory.ingredient.sauce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.sauce.MarinaraSauce;

class MarinaraSauceTest {

	MarinaraSauce ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new MarinaraSauce();
	}

	@Test
	void testGetDescription() {
		String expected = "Marinara Sauce";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
