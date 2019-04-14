package state;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public String insertQuarter() {
		return "Please wait, we're already giving you a gumball";
	}
 
	public String ejectQuarter() {
		return "Sorry, you already turned the crank";
	}
 
	public String turnCrank() {
		return "Turning twice doesn't get you another gumball!";
	}
 
	public String dispense() {
		String message = gumballMachine.releaseBall(); 
		
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			message += System.lineSeparator() + "Oops, out of gumballs!";
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		return message;
	}
	
	public void refill() { 
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


