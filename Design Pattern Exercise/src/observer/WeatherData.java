package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay currentConditionsDisplay;
	public StatisticsDisplay statisticsDisplay;
	public ForecastDisplay forecastDisplay;
	
	public WeatherData() {
		currentConditionsDisplay = new CurrentConditionsDisplay();
		statisticsDisplay = new StatisticsDisplay();
		forecastDisplay = new ForecastDisplay();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void measurementsChanged() {
		currentConditionsDisplay.update(temperature, humidity, pressure);
		statisticsDisplay.update(temperature, humidity, pressure);
		forecastDisplay.update(temperature, humidity, pressure);
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
