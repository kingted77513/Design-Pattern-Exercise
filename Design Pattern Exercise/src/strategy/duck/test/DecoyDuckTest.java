package strategy.duck.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategy.duck.DecoyDuck;

class DecoyDuckTest {
	
	DecoyDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new DecoyDuck();
	}

	@Test
	void testQuack() {
		String expected = "I can't quack";
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
		String expected = "I'm a duck Decoy";
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
