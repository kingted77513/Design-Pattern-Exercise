package bridge;

public class RCA extends TV {

	@Override
	public String on() {
		return "Turn on RCA TV";
	}

	@Override
	public String off() {
		return "Turn off RCA TV";
	}

	@Override
	public String turnChannel(int channel) {
		return "Turn to channel to " + channel + " of RCA TV";
	}

}
