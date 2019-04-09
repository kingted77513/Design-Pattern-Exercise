package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.Light;

class LightTest {
	
	Light light;
	
	@BeforeEach
	void setup() {
		light = new Light();
	}

	@Test
	void testTurnOnTheLight() {
		String excepted = "Light is on";
		String actual = light.on();
		assertEquals(excepted, actual);
	}

	@Test
	void testTurnOffTheLight() {
		String excepted = "Light is off";
		String actual = light.off();
		assertEquals(excepted, actual);
	}
}
