import displays.CurrentConditionsDisplay;
import displays.ForecastDisplay;
import displays.StatisticsDisplay;
import weatherData.WeatherData;

public class ObserverPattern {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println();
		weatherData.setMeasurements(82, 56, 31.5f);
		System.out.println();
		weatherData.setMeasurements(78, 90, 31.5f);


	}
}
