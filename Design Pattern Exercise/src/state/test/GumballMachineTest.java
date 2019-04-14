package state.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import state.GumballMachine;

class GumballMachineTest {
	
	GumballMachine machine;
		
	@Test
	void testNoGumballToSold() {
		machine = initialGumballMachineWithoutGumball();
		
		int exceptedStatus = GumballMachine.SOLD_OUT;
		testgetMachineStatus(exceptedStatus);
		
		String excepted = "You can't insert a quarter, the machine is sold out";
		testInsertQuarter(excepted);
		
		excepted = "You turned, but there are no gumballs";
		testTurnCrank(excepted);
	}
	
	private GumballMachine initialGumballMachineWithoutGumball() {
		int candyNumber = 0;
		GumballMachine machine = new GumballMachine(candyNumber);
		return machine;
	}
	
	private void testgetMachineStatus(int excepted) {
		int actual = machine.getMachineStatus();
		assertEquals(excepted, actual);
	}

	private void testInsertQuarter(String excepted) {
		String actual = machine.insertQuarter();
		assertEquals(excepted, actual);
	}
	
	private void testTurnCrank(String excepted) {
		String actual = machine.turnCrank();
		assertEquals(excepted, actual);
	}

	@Test
	void testSoldFiveGumball() {
		machine = initialGumballMachineWithFiveGumball();
		int exceptedStatus = GumballMachine.NO_QUARTER;
		testgetMachineStatus(exceptedStatus);
		
		buyAGumball();
		buyAGumball();
		buyAGumball();
		buyAGumball();
		buyAGumball();
	}
	
	private void buyAGumball() {
		String excepted = "You inserted a quarter";
		testInsertQuarter(excepted);
		
		testTurnCrankWhenStillHaveBumball();
	}
	
	private void testTurnCrankWhenStillHaveBumball() {
		String actual = machine.turnCrank();
		String excepted = getTurnCrankMessageAfterSoldAGumball();
		assertEquals(excepted, actual);
	}
	
	private String getTurnCrankMessageAfterSoldAGumball() {
		int status = machine.getMachineStatus();
		String message;
		switch (status) {
		case GumballMachine.NO_QUARTER:
			message = getTurnCrankMessageWhenSoldAGumball();
			break;
		case GumballMachine.SOLD_OUT:
			message = getTurnCrankMessageWhenSoldTheLastGumball();
			break;
		default:
			message = "No Message";
		}
		return message;
	}
	
	private String getTurnCrankMessageWhenSoldAGumball() {
		String message = "You turned..." + System.lineSeparator() 
		+ "A gumball comes rolling out the slot";
		return message;
	}
	
	private String getTurnCrankMessageWhenSoldTheLastGumball() {
		String message = "You turned..." + System.lineSeparator() 
		+ "A gumball comes rolling out the slot" + System.lineSeparator()
		+ "Oops, out of gumballs!";
		return message;
	}

	private GumballMachine initialGumballMachineWithFiveGumball() {
		int candyNumber = 5;
		GumballMachine machine = new GumballMachine(candyNumber);
		return machine;
	}
}
