package factory.ingredient.clams.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.clams.FrozenClams;

class FrozenClamsTest {

	FrozenClams ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new FrozenClams();
	}

	@Test
	void testGetDescription() {
		String expected = "Frozen Clams from Chesapeake Bay";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
