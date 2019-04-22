package bridge;

public class Sony extends TV {

	@Override
	public String on() {
		return "Turn on Sony TV";
	}

	@Override
	public String off() {
		return "Turn off Sony TV";
	}

	@Override
	public String turnChannel(int channel) {
		return "Turn to channel to " + channel + " of Sony TV";
	}

}
