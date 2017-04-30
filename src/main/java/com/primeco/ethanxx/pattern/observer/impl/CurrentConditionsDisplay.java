package com.primeco.ethanxx.pattern.observer.impl;

import com.primeco.ethanxx.pattern.observer.DisplayElement;
import com.primeco.ethanxx.pattern.observer.Observer;
import com.primeco.ethanxx.pattern.observer.Subject;

/**
 * Created by ethan on 30/04/2017.
 * 布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
