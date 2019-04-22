package bridge.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bridge.Sony;

class SonyTest {
	
	Sony tv;

	@BeforeEach
	void setUp() throws Exception {
		tv = new Sony();
	}

	@Test
	void testTurnOn() {
		String excepted = "Turn on Sony TV";
		String actual = tv.on();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnOff() {
		String excepted = "Turn off Sony TV";
		String actual = tv.off();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnChannel() {
		int channel = 10;
		String excepted = "Turn to channel to " + channel + " of Sony TV";
		String actual = tv.turnChannel(channel);
		assertEquals(excepted, actual);
	}

}
