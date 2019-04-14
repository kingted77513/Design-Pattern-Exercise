package state;

public class GumballMachine {
 
	final static public int SOLD_OUT = 0;
	final static public int NO_QUARTER = 1;
	final static public int HAS_QUARTER = 2;
	final static public int SOLD = 3;
 
	private int state = SOLD_OUT;
	private int count = 0;
  
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
  
	public String insertQuarter() {
		String message = "No message";
		
		if (state == HAS_QUARTER) {
			message = "You can't insert another quarter";
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			message = "You inserted a quarter";
		} else if (state == SOLD_OUT) {
			message = "You can't insert a quarter, the machine is sold out";
		} else if (state == SOLD) {
        	message = "Please wait, we're already giving you a gumball";
		}
		
		return message;
	}

	public String ejectQuarter() {
		String message = "No message";
		
		if (state == HAS_QUARTER) {
			message = "Quarter returned";
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			message = "You haven't inserted a quarter";
		} else if (state == SOLD) {
			message = "Sorry, you already turned the crank";
		} else if (state == SOLD_OUT) {
        	message = "You can't eject, you haven't inserted a quarter yet";
		}
		
		return message;
	}
 
	public String turnCrank() {
		String message = "No message";
		
		if (state == SOLD) {
			message = "Turning twice doesn't get you another gumball!";
		} else if (state == NO_QUARTER) {
			message = "You turned but there's no quarter";
		} else if (state == SOLD_OUT) {
			message = "You turned, but there are no gumballs";
		} else if (state == HAS_QUARTER) {
			message = "You turned...";
			state = SOLD;
			message += dispense();
		}
		
		return message;
	}
 
	private String dispense() {
		String message = "No message";
		
		if (state == SOLD) {
			message = System.lineSeparator() + "A gumball comes rolling out the slot";
			count = count - 1;
			if (count == 0) {
				message += System.lineSeparator() + "Oops, out of gumballs!";
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			message = "You need to pay first";
		} else if (state == SOLD_OUT) {
			message = "No gumball dispensed";
		} else if (state == HAS_QUARTER) {
			message = "No gumball dispensed";
		}
		
		return message;
	}
 
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public int getMachineStatus() {
		return state;
	}
	
	public boolean isSoldOut() {
		return (state == SOLD_OUT);
	}
}


