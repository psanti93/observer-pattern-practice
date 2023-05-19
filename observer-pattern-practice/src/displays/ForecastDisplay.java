package displays;

import interfaces.Display;
import interfaces.Observer;
import weatherData.WeatherData;

public class ForecastDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}

	@Override
	public void display() {
		String forecastPrediction = forecast();
		System.out.println("Forecast calls for: " + forecastPrediction);
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
		
	}
	
	public String forecast(){
		
		if(temperature <= 80.0 && humidity < 70.0){
			return "Improving weather on the way";
		}else if(temperature > 80.0 && humidity < 90.0){
			return "Watch out for cooler, rainy weather";
		}	
		return "More of the same";
	}
}
