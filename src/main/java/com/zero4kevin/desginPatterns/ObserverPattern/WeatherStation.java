package com.zero4kevin.desginPatterns.ObserverPattern;

/**
 * Created by xi1zhang on 2017/6/20.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay dsp=new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay=new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        weatherData.setMeasurements(132, 67.5f,34.4f);
        weatherData.setMeasurements(76,77.4f,44);
    }
}
