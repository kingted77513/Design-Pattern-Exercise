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
		int GumballNumber = 1000;
		machine = initialGumballMachineWithSomeGumball(GumballNumber);
		Object exceptedStatus = NoQuarterState.class;
		testgetMachineStatus(exceptedStatus);
		
		int winnerTimes = 0;
		
		while (machine.getCount() > 0) {
			int beforeCount = machine.getCount();
			buyAGumball();
			int afterCount = machine.getCount();
			
			if (isSoldTwoGumball(beforeCount, afterCount)) {
				winnerTimes++;
			}
		}
		
		double excepted = 0.1;
		double actual = (double)winnerTimes / GumballNumber;
		assertEquals(excepted, actual, 0.02);
	}
	
	private void buyAGumball() {
		String excepted = "You inserted a quarter";
		testInsertQuarter(excepted);
		
		try {
			testTurnCrankWhenStillHaveGumball();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void testTurnCrankWhenStillHaveGumball() throws Exception {
		int before = machine.getCount();
		String actual = machine.turnCrank();
		int after = machine.getCount();
		String excepted = getTurnCrankMessageAfterSoldAGumball(before, after);
		assertEquals(excepted, actual);
	}
	
	private String getTurnCrankMessageAfterSoldAGumball
		(int gumballNumberBeforeTrunCrank, int gumballNumberAfterTrunCrank) throws Exception {
		State status = machine.getState();
		String message;
		if (status instanceof NoQuarterState) {
			message = getTurnCrankMessage(gumballNumberBeforeTrunCrank
					, gumballNumberAfterTrunCrank);
		}else if (status instanceof SoldOutState) {
			message = getTurnCrankMessageWhenSoldTheLastGumball();
		}else {
			message = "No Message";
		}
		return message;
	}
	
	private String getTurnCrankMessage(int gumballNumberBeforeTrunCrank
			, int gumballNumberAfterTrunCrank) throws Exception {
		String message;
		if (isSoldAGumball(gumballNumberBeforeTrunCrank
				, gumballNumberAfterTrunCrank)) {
			message = getTurnCrankMessageWhenSoldAGumball();
		}else if (isSoldTwoGumball(gumballNumberBeforeTrunCrank
				, gumballNumberAfterTrunCrank)) {
			message = getTurnCrankMessageWhenWinnerStateAndSoldTwoGumball();
		}else {
			throw new Exception("before = " + gumballNumberBeforeTrunCrank
					+ " after = " + gumballNumberAfterTrunCrank);
		}
		return message;
	}
	
	private boolean isSoldAGumball(int gumballNumberBeforeTrunCrank
			, int gumballNumberAfterTrunCrank) {
		return (gumballNumberBeforeTrunCrank
				- gumballNumberAfterTrunCrank == 1);
	}
	
	private String getTurnCrankMessageWhenSoldAGumball() {
		String message = "You turned..." + System.lineSeparator()
		+ "A gumball comes rolling out the slot...";
		return message;
	}
	
	private boolean isSoldTwoGumball(int gumballNumberBeforeTrunCrank
			, int gumballNumberAfterTrunCrank) {
		return (gumballNumberBeforeTrunCrank
				- gumballNumberAfterTrunCrank == 2);
	}
	
	private String getTurnCrankMessageWhenWinnerStateAndSoldTwoGumball() {
		String message = "You turned..." + System.lineSeparator() 
		+ "A gumball comes rolling out the slot..." + System.lineSeparator()
		+ "YOU'RE A WINNER! You got two gumballs for your quarter"
				+ System.lineSeparator() 
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
