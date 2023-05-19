package displays;

import interfaces.Display;
import interfaces.Observer;
import weatherData.WeatherData;

public class ForecastDisplay implements Observer, Display {
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}

	@Override
	public void display() {
		System.out.println("The temperature for today is: " + temperature + "with a humidity of " + humidity + "and pressure of" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}

}
