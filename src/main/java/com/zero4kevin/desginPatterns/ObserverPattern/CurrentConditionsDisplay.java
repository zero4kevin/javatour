package com.zero4kevin.desginPatterns.ObserverPattern;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by xi1zhang on 2017/6/20.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    Observable obs;

    public CurrentConditionsDisplay(Observable observable){
        this.obs=observable;
        obs.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            this.humidity=weatherData.getHumidity();
            this.temperature=weatherData.getTemperature();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions:" + temperature + "F degress and "+ humidity +"% humidity");
    }
}
