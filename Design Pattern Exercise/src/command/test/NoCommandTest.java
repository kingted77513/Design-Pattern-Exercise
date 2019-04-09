package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import command.NoCommand;

class NoCommandTest {
	
	NoCommand command;

	@BeforeEach
	void setUp() throws Exception {
		command = new NoCommand();
	}

	@Test
	void testExecuteCommandToDoNothing() {
		String excepted = "Nothing to do";
		String actual = command.execute();
		assertEquals(excepted, actual);
	}

}
