package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.StatisticsDisplay;

class StatisticsDisplayTest {

	WeatherData weatherData;
	StatisticsDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherData = new WeatherData();
		display = new StatisticsDisplay(weatherData);
	}

	@Test
	void testDisplay() {
		String excepted = "Avg/Max/Min temperature = 80.0/82.0/78.0";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 30.4f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		temperature = 82;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		temperature = 78;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
}
