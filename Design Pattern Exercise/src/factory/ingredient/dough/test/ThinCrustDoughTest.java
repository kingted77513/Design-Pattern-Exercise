package factory.ingredient.dough.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.dough.ThinCrustDough;

class ThinCrustDoughTest {

	ThinCrustDough ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new ThinCrustDough();
	}

	@Test
	void testGetDescription() {
		String expected = "Thin Crust Dough";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
