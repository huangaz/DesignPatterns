package com.xiaomi.Display;

import com.xiaomi.Observer.DisplayElement;
import com.xiaomi.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
	    if (o instanceof WeatherData) {
	    	WeatherData weatherData = (WeatherData) o;
	    	float temp = weatherData.getTemperature();
	    	tempSum += temp;
			numReadings++;
			if (temp > maxTemp) {
				maxTemp = temp;
			}

			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
