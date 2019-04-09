package command;

public class CeilingFan {
	String location = "";
	int level;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int CLOSE = 0;
	
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		level = HIGH; 
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		level = MEDIUM;
	}

	public void low() {
		// turns the ceiling fan on to low
		level = LOW;
	}
 
	public void off() {
		// turns the ceiling fan off
		level = 0;
	}
 
	public int getSpeed() {
		return level;
	}
}
