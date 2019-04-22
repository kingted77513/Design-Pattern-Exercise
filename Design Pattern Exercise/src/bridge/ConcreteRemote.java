package bridge;

public class ConcreteRemote extends RemoteControl {
	private int currentStation;
	
	private TV[] TVs;
	private int TVIndex;
	
	public ConcreteRemote() {
		currentStation = 1;
		TVIndex = 0;
		TVs = new TV[]{new RCA(), new Sony()};
		setTV(TVs[TVIndex]);
	}
	
	public String nextChannel() {
		return setChannel(++currentStation);
	}
	
	public String previousChannel() {
		return setChannel(--currentStation);
	}
	
	public void switchNextTV() {
		int index = getNextTVIndex();
		setTV(TVs[index]);
	}
	
	private int getNextTVIndex() {
		if (TVIndex < TVs.length) {
			TVIndex++;
		}else {
			TVIndex = 0;
		}
		return TVIndex;
	}

}
