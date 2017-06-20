package com.zero4kevin.desginPatterns.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xi1zhang on 2017/6/20.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float lastPressure;
    private float currentPressure=29.92f;
    Observable observable;

    public ForecastDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object ar) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData) observable;
            lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
    }

    public void display(){
        String trend=null;
        if(lastPressure==currentPressure){
            trend="stay the same";
        }else if(lastPressure > currentPressure){
            trend="become hotter";
        }else{
            trend="become cooler";
        }
        System.out.println("The weather will "+ trend+ ".");
    }
}