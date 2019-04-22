package bridge.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bridge.ConcreteRemote;

class ConcreteRemoteTest {
	
	ConcreteRemote control;

	@BeforeEach
	void setUp() throws Exception {
		control = new ConcreteRemote();
	}

	@Test
	void testTurnOn() {
		String excepted = "Turn on RCA TV";
		String actual = control.on();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnOff() {
		String excepted = "Turn off RCA TV";
		String actual = control.off();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testTurnChannel() {
		String excepted = "Turn to channel to 2 of RCA TV";
		String actual = control.nextChannel();
		assertEquals(excepted, actual);
		
		excepted = "Turn to channel to 1 of RCA TV";
		actual = control.previousChannel();
		assertEquals(excepted, actual);
		
		excepted = "Turn to channel to 2 of Sony TV";
		control.switchNextTV();
		actual = control.nextChannel();
		assertEquals(excepted, actual);
	}

}
