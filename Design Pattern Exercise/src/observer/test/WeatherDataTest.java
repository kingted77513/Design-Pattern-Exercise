package observer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

class WeatherDataTest {
	WeatherData data;

	@BeforeEach
	void setUp() throws Exception {
		data = new WeatherData();
	}

	@Test
	void testGetChangedData() {
		float exptectedTemperature = 80;
		float exptectedHumidity = 65;
		float exptectedPressure = 30.4f;
		
		data.setMeasurements(exptectedTemperature, exptectedHumidity
				, exptectedPressure);
		
		float actualTemperature = data.getTemperature();
		float actualHumidity = data.getHumidity();
		float actualPressure = data.getPressure();
		
		assertEquals(exptectedTemperature, actualTemperature);
		assertEquals(exptectedHumidity, actualHumidity);
		assertEquals(exptectedPressure, actualPressure);
	}
	
	@Test
	void testChangedMeasurement() {
		String exptectedCurrentConditionsDisplay
			= "Current conditions: 80.0F degrees and 60.0% humidity";
		String exptectedStatisticsDisplay
			= "Avg/Max/Min temperature = 80.0/80.0/80.0";
		String exptectedForecastDisplay
			= "Forecast: Improving weather on the way!";
		
		CurrentConditionsDisplay currentConditionsDisplay
			= new CurrentConditionsDisplay(data);
		ForecastDisplay forecastDisplay
			= new ForecastDisplay(data);
		StatisticsDisplay statisticsDisplay
			= new StatisticsDisplay(data);
		
		data.setMeasurements(80, 60, 30.4f);
		data.measurementsChanged();
		
		String actualCurrentConditionsDisplay 
			= currentConditionsDisplay.display();
		String actualStatisticsDisplay
			= statisticsDisplay.display();
		String actualForecastDisplay
			= forecastDisplay.display();
		
		assertEquals(exptectedCurrentConditionsDisplay
				, actualCurrentConditionsDisplay);
		assertEquals(exptectedStatisticsDisplay
				, actualStatisticsDisplay);
		assertEquals(exptectedForecastDisplay
				, actualForecastDisplay);
	}

}
