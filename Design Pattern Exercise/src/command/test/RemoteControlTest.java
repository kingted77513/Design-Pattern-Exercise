package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.RemoteControl;

class RemoteControlTest {
	
	RemoteControl invoker;

	@BeforeEach
	void setUp() throws Exception {
		invoker = new RemoteControl();
		setUpLightButton();
	}

	private void setUpLightButton() {
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		invoker.setCommand(0, lightOn, lightOff);
	}

	@Test
	void testPressAllButton() {
		String excepted = "Light is on";
		String actual = invoker.onButtonWasPushed(0);
		assertEquals(excepted, actual);
		
		excepted = "Light is off";
		actual = invoker.offButtonWasPushed(0);
		assertEquals(excepted, actual);
		
		excepted = "Nothing to do";
		actual = invoker.onButtonWasPushed(1);
		assertEquals(excepted, actual);
		
		excepted = "Nothing to do";
		actual = invoker.offButtonWasPushed(1);
		assertEquals(excepted, actual);
	}

}
