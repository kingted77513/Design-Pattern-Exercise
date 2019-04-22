package bridge;

public abstract class RemoteControl {
	private TV implementor;
	
	public void setTV(TV tv) {
		implementor = tv;
	}
	
	public String on() {
		return implementor.on();
	}
	
	public String off() {
		return implementor.off();
	}
	
	public String setChannel(int channel) {
		return implementor.turnChannel(channel);
	}
}
