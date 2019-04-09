package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.Light;
import command.LightOnCommand;

class LightOnCommandTest {
	
	LightOnCommand command;

	@BeforeEach
	void setUp() throws Exception {
		Light light = new Light();
		command = new LightOnCommand(light);
	}

	@Test
	void testExecuteCommandToTurnOffLight() {
		String excepted = "Light is on";
		String actual = command.execute();
		assertEquals(excepted, actual);
	}

}
