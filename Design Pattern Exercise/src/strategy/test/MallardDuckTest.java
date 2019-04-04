package strategy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategy.MallardDuck;

class MallardDuckTest {
	MallardDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new MallardDuck();
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
		String expected = "I'm a real Mallard duck";
		String actual = duck.display();
		assertEquals(expected, actual);
	}
}
