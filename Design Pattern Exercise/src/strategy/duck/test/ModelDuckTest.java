package strategy.duck.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategy.duck.ModelDuck;

class ModelDuckTest {
	
	ModelDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new ModelDuck();
	}

	@Test
	void testQuack() {
		String expected = "Quack";
		String actual = duck.quack();
		assertEquals(expected, actual);
	}
	
	@Test
	void testSwin() {
		String expected = "Swin";
		String actual = duck.swim();
		assertEquals(expected, actual);
	}
	
	@Test
	void testDisplay() {
		String expected = "I'm a model duck";
		String actual = duck.display();
		assertEquals(expected, actual);
	}

	@Test
	void testFly() {
		String expected = "I can't fly";
		String actual = duck.fly();
		assertEquals(expected, actual);
	}
}
