package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.SimpleRemoteControl;

class SimpleRemoteControlTest {
	
	SimpleRemoteControl invoker;

	@BeforeEach
	void setUp() throws Exception {
		invoker = new SimpleRemoteControl();
	}

	@Test
	void testPressButtonToTurnOnLight() {
		String excepted = "Light is on";
		
		Light light = new Light();
		LightOnCommand lightOnCmd = new LightOnCommand(light);
		invoker.setCommand(lightOnCmd);
		String actual = invoker.buttonWasPressed();
		
		assertEquals(excepted, actual);
	}
	
	@Test
	void testPressButtonToTurnOffLight() {
		String excepted = "Light is off";
		
		Light light = new Light();
		LightOffCommand lightOffCmd = new LightOffCommand(light);
		invoker.setCommand(lightOffCmd);
		String actual = invoker.buttonWasPressed();
		
		assertEquals(excepted, actual);
	}

}
