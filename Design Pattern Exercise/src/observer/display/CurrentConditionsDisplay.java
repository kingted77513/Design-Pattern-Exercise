package observer.display;
	
public class CurrentConditionsDisplay implements DisplayElement {
	private float temperature;
	private float humidity;
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	public String display() {
		String message = "Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity";
		return message;
	}
}
