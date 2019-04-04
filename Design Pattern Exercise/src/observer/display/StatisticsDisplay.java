package observer.display;

import java.util.Observable;
import java.util.Observer;

import observer.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Observable observable;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public String display() {
		String message = "Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp;
		return message;
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			float temp = weatherData.getTemperature();
			
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
	 
			if (temp < minTemp) {
				minTemp = temp;
			}
		}
	}
}
