package com.zero4kevin.desginPatterns.ObserverPattern;

import java.util.Observable;
/**
 * Created by xi1zhang on 2017/6/20.
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return temp;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}