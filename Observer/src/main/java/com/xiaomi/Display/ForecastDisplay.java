package com.xiaomi.Display;

import com.xiaomi.Observer.DisplayElement;
import com.xiaomi.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	Observable observable;
    private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
	    if (o instanceof WeatherData) {
	    	WeatherData weatherData = (WeatherData) o;
	    	lastPressure = currentPressure;
	    	currentPressure = weatherData.getPressure();
	    	display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
