package adapter;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public String quack() {
		return turkey.gobble();
	}
  
	public String fly() {
		String fly = "";
		for(int i=0; i < 5; i++) {
			fly += turkey.fly() + System.lineSeparator();
		}
		return fly;
	}
}
