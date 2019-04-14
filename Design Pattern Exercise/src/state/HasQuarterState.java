package state;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public String insertQuarter() {
		return "You can't insert another quarter";
	}
 
	public String ejectQuarter() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		return "Quarter returned";
	}
 
	public String turnCrank() {
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		return "You turned...";
	}

    public String dispense() {
        return "No gumball dispensed";
    }
    
    public void refill() { }
}
