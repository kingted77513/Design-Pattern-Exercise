package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.ForecastDisplay;

class ForecastDisplayTest {

	WeatherData weatherData;
	ForecastDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherData = new WeatherData();
		display = new ForecastDisplay(weatherData);
	}

	@Test
	void testDisplayOfImprovingWeather() {
		String excepted = "Forecast: Improving weather on the way!";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 29f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		pressure = 30.4f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testDisplayOfSameWeather() {
		String excepted = "Forecast: More of the same";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 29f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		pressure = 29f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testDisplayOfCoolerWeather() {
		String excepted = "Forecast: Watch out for cooler, rainy weather";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 30.4f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		pressure = 29f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}

}
