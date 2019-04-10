package adapter.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.MallardDuck;

class MallardDuckTest {
	
	MallardDuck duck;

	@BeforeEach
	void setUp() throws Exception {
		duck = new MallardDuck();
	}

	@Test
	void testQuack() {
		String excepted = "Quack";
		String actual = duck.quack();
		assertEquals(excepted, actual);
	}

}
