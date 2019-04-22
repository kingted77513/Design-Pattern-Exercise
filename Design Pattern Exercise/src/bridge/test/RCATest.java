package bridge.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bridge.RCA;

class RCATest {
	
	RCA tv;

	@BeforeEach
	void setUp() throws Exception {
		tv = new RCA();
	}

	@Test
	void testTurnOn() {
		String excepted = "Turn on RCA TV";
		String actual = tv.on();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnOff() {
		String excepted = "Turn off RCA TV";
		String actual = tv.off();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnChannel() {
		int channel = 10;
		String excepted = "Turn to channel to " + channel + " of RCA TV";
		String actual = tv.turnChannel(channel);
		assertEquals(excepted, actual);
	}

}
