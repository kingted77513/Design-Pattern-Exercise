package adapter.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.WildTurkey;

class WildTurkeyTest {
	
	WildTurkey turkey;

	@BeforeEach
	void setUp() throws Exception {
		turkey = new WildTurkey();
	}

	@Test
	void testGobble() {
		String excepted = "Gobble gobble";
		String actual = turkey.gobble();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testFly() {
		String excepted = "I'm flying a short distance";
		String actual = turkey.fly();
		assertEquals(excepted, actual);
	}

}
