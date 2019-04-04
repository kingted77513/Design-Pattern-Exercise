package observer.display;

import java.util.Observable;
import java.util.Observer;

import observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public String display() {
		String message = "Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity";
		return message;
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
		}
	}
}
