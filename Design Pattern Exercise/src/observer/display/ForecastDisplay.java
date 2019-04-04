package observer.display;

import java.util.Observable;
import java.util.Observer;

import observer.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable observable;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public String display() {
		String message = "Forecast: ";
		if (currentPressure > lastPressure) {
			message += "Improving weather on the way!";
		} else if (currentPressure == lastPressure) {
			message += "More of the same";
		} else if (currentPressure < lastPressure) {
			message += "Watch out for cooler, rainy weather";
		}
		return message;
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
		}
	}
}
