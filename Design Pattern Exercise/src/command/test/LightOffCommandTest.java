package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.Light;
import command.LightOffCommand;

class LightOffCommandTest {
	
	LightOffCommand command;

	@BeforeEach
	void setUp() throws Exception {
		Light light = new Light();
		command = new LightOffCommand(light);
	}

	@Test
	void testExecuteCommandToTurnOffLight() {
		String excepted = "Light is off";
		String actual = command.execute();
		assertEquals(excepted, actual);
	}

}
