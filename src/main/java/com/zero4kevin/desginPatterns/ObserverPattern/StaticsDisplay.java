package com.zero4kevin.desginPatterns.ObserverPattern;

import java.util.*;

/**
 * Created by xi1zhang on 2017/6/20.
 */
public class StaticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temps;
    private float maxTemp;
    private float minTemp;
    private float avgTemp;
    private Observable observable;

    public StaticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        temps=new ArrayList<Float>();
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            temps.add(weatherData.getTemperature());
            display();
        }
    }

    public void display() {
        Collections.sort(temps);
        minTemp = temps.get(0);
        maxTemp = temps.get(temps.size()-1);
        avgTemp = getAvgTemp(temps);
        System.out.println("The max temperature is " + maxTemp + ", the min temperature is " + minTemp + ", the average temperature is " + avgTemp);
    }

    private float getAvgTemp(ArrayList<Float> temps) {
        Iterator<Float> iterator = temps.iterator();
        int number = 0;
        float total = 0;
        while (iterator.hasNext()) {
            total += iterator.next();
            number += 1;
        }
        return total / number;
    }
}
