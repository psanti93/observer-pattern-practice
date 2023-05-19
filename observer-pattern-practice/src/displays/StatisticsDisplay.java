package displays;

import interfaces.Display;
import interfaces.Observer;
import weatherData.WeatherData;

public class StatisticsDisplay implements Observer, Display{
	private float temperature;
	private float avg;
	private float min;
	private float max;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
;
	@Override
	public void display() {
		float tempMax = 0.0f;
		float tempMin = 0.0f;
		tempMax = Math.max(temperature,this.max);
		this.max = tempMax;		
		
		if(min != 0.0f){
			tempMin = Math.min(temperature, min);
			this.min = tempMin;
		}else{
			tempMin = Math.min(temperature, max);
			this.min = tempMin;
		}
		
		System.out.println("Avg/Min/Max temperature = " + min + "/" + max);
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		display();
	}
	
	

}
