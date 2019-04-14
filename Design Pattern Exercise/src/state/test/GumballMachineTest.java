package state.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import state.GumballMachine;
import state.NoQuarterState;
import state.SoldOutState;
import state.State;

class GumballMachineTest {
	
	GumballMachine machine;
		
	@Test
	void testNoGumballToSold() {
		machine = initialGumballMachineWithoutGumball();
		
		Object exceptedStatus = SoldOutState.class;
		testgetMachineStatus(exceptedStatus);
		
		String excepted = "You can't insert a quarter, the machine is sold out";
		testInsertQuarter(excepted);
		
		excepted = "You turned, but there are no gumballs"
				+ System.lineSeparator() + "No gumball dispensed";
		testTurnCrank(excepted);
	}
	
	private GumballMachine initialGumballMachineWithoutGumball() {
		int candyNumber = 0;
		GumballMachine machine = new GumballMachine(candyNumber);
		return machine;
	}
	
	private void testgetMachineStatus(Object excepted) {
		State actual = machine.getState();
		assertEquals(excepted, actual.getClass());
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
	void testSoldManyGumball() {
		int GumballNumber = 5;
		machine = initialGumballMachineWithSomeGumball(GumballNumber);
		Object exceptedStatus = NoQuarterState.class;
		testgetMachineStatus(exceptedStatus);
		
		for (int i = 0 ; i < GumballNumber ; i++) {
			buyAGumball();
		}
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
		State status = machine.getState();
		String message;
		if (status instanceof NoQuarterState) {
			message = getTurnCrankMessageWhenSoldAGumball();
		}else if (status instanceof SoldOutState) {
			message = getTurnCrankMessageWhenSoldTheLastGumball();
		}else {
			message = "No Message";
		}
		return message;
	}
	
	private String getTurnCrankMessageWhenSoldAGumball() {
		String message = "You turned..." + System.lineSeparator() 
		+ "A gumball comes rolling out the slot...";
		return message;
	}
	
	private String getTurnCrankMessageWhenSoldTheLastGumball() {
		String message = "You turned..." + System.lineSeparator() 
		+ "A gumball comes rolling out the slot..." + System.lineSeparator()
		+ "Oops, out of gumballs!";
		return message;
	}

	private GumballMachine initialGumballMachineWithSomeGumball(int gumballNumber) {
		GumballMachine machine = new GumballMachine(gumballNumber);
		return machine;
	}
}
