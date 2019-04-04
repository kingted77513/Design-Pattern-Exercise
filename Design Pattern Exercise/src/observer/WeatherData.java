package observer;

public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		
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
