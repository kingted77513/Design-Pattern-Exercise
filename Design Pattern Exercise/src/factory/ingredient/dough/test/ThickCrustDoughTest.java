package factory.ingredient.dough.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.dough.ThickCrustDough;

class ThickCrustDoughTest {

	ThickCrustDough ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new ThickCrustDough();
	}

	@Test
	void testGetDescription() {
		String expected = "ThickCrust style extra thick crust dough";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
