package factory.ingredient.pepperoni.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.ingredient.pepperoni.SlicedPepperoni;

class SlicedPepperoniTest {

	SlicedPepperoni ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient =  new SlicedPepperoni();
	}

	@Test
	void testGetDescription() {
		String expected = "Sliced Pepperoni";
		String actual = ingredient.getDescription();
		assertEquals(expected, actual);
	}

}
