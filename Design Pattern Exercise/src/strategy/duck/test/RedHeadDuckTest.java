package strategy.duck.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategy.duck.RedHeadDuck;

class RedHeadDuckTest {
	
	RedHeadDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new RedHeadDuck();
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
		String expected = "I'm a real Red Headed duck";
		String actual = duck.display();
		assertEquals(expected, actual);
	}

	@Test
	void testFly() {
		String expected = "Fly";
		String actual = duck.fly();
		assertEquals(expected, actual);
	}
}
