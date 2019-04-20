package state;

public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public String insertQuarter() {
		return "Please wait, we're already giving you a Gumball";
	}
 
	public String ejectQuarter() {
		return "Please wait, we're already giving you a Gumball";
	}
 
	public String turnCrank() {
		return "Turning again doesn't get you another gumball!";
	}
 
	public String dispense() {
		String message = gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			message += System.lineSeparator()
					+ "YOU'RE A WINNER! You got two gumballs for your quarter";
			message += System.lineSeparator()
					+ gumballMachine.releaseBall();
			
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				message += System.lineSeparator() + "Oops, out of gumballs!"; 
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
		return message;
	}
 
	public void refill() { }
	
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
