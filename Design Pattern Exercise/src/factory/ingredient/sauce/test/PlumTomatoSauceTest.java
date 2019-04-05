package factory.ingredient.sauce.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.sauce.PlumTomatoSauce;

class PlumTomatoSauceTest {

	PlumTomatoSauce ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new PlumTomatoSauce();
	}

	@Test
	void testGetDescription() {
		String expected = "Tomato sauce with plum tomatoes";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
