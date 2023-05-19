package displays;

import interfaces.Display;
import interfaces.Observer;
import weatherData.WeatherData;

public class StatisticsDisplay implements Observer, Display{
	private float temperature;
	private float avg;
	private float min;
	private float max;
	private float temperatureSum;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
;
	@Override
	public void display() {
		this.avg = averageTemp();
		this.max = maxTemp();
		this.min = minTemp();
		
		System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min );
		
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		display();
	}
	
	
	public float maxTemp(){
		float tempMax = 0.0f;
		tempMax = Math.max(temperature, max);
		this.max = tempMax;
		
		return max;
		
	}
	
	public float minTemp(){
		float tempMin = 0.0f;
		if(min != 0.0f){
			tempMin = Math.min(temperature, min);
			this.min = tempMin;
			return min;
		}
		tempMin = Math.min(temperature, max);
		this.min = tempMin;
		return min;
	}
	
	
	float total = 0;
	
	public float averageTemp(){

		total++;		
		this.temperatureSum += temperature;
		this.avg = temperatureSum/total;
		
		return avg;
	}
	

}
