import displays.CurrentConditionsDisplay;
import displays.StatisticsDisplay;
import weatherData.WeatherData;

public class ObserverPattern {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 56, 31.5f);
		weatherData.setMeasurements(102, 56, 31.5f);
		weatherData.setMeasurements(69, 56, 31.5f);


	}
}
