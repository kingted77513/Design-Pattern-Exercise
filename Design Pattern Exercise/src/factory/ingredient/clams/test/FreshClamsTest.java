package factory.ingredient.clams.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.clams.FreshClams;

class FreshClamsTest {

	FreshClams ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new FreshClams();
	}

	@Test
	void testGetDescription() {
		String expected = "Fresh Clams from Long Island Sound";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
