package strategy.dock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import strategy.duck.RubberDuck;

class RubberDuckTest {
	
	RubberDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new RubberDuck();
	}

	@Test
	void testQuack() {
		String expected = "Squeak";
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
		String expected = "I'm a rubber duck";
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
