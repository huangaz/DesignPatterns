package com.xiaomi.ObserverTest;

import com.xiaomi.Display.CurrentConditionsDisplay;
import com.xiaomi.Display.ForecastDisplay;
import com.xiaomi.Display.HeatIndexDisplay;
import com.xiaomi.Display.StatisticsDisplay;
import com.xiaomi.WeatherData.WeatherData;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();

        CurrentConditionsDisplay d1 = new CurrentConditionsDisplay(w);
        ForecastDisplay d2 = new ForecastDisplay(w);
        StatisticsDisplay d3 = new StatisticsDisplay(w);
        HeatIndexDisplay d4 = new HeatIndexDisplay(w);

        w.setMeasurements(80,65,30.4f);
        System.out.println();
        w.setMeasurements(82,70,29.2f);
        System.out.println();
        w.setMeasurements(78,90,29.2f);
    }
}
